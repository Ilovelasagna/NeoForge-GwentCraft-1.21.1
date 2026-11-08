package com.ilovelasagna.gwentcraft.entity;

import com.ilovelasagna.gwentcraft.entity.profile.GwentPlayerProfile;
import com.ilovelasagna.gwentcraft.entity.profile.GwentPlayerProfiles;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class GwentPlayerEntity extends PathfinderMob {

    // Stores the NPC's profile ID and synchronizes it with clients.
    private static final EntityDataAccessor<String> PROFILE_ID =
            SynchedEntityData.defineId(
                    GwentPlayerEntity.class,
                    EntityDataSerializers.STRING
            );

    public GwentPlayerEntity(
            EntityType<? extends PathfinderMob> entityType,
            Level level
    ) {
        super(entityType, level);

        // Prevent the NPC from naturally despawning.
        this.setPersistenceRequired();
    }

    @Override
    protected void defineSynchedData(
            SynchedEntityData.Builder builder
    ) {
        super.defineSynchedData(builder);

        // Every Gwent Player starts with Aldric's profile.
        builder.define(
                PROFILE_ID,
                GwentPlayerProfiles.ALDRIC.id().toString()
        );
    }

    // Assign a profile to this NPC.
    public void setProfile(ResourceLocation profileId) {

        GwentPlayerProfile profile =
                GwentPlayerProfiles.get(profileId);

        if (profile == null) {
            throw new IllegalArgumentException(
                    "Unknown Gwent Player profile: " + profileId
            );
        }

        this.entityData.set(
                PROFILE_ID,
                profileId.toString()
        );

        // Set the NPC's visible name.
        this.setCustomName(
                Component.literal(profile.name())
        );

        this.setCustomNameVisible(true);
    }

    // Retrieve the NPC's profile ID.
    public ResourceLocation getProfileId() {
        return ResourceLocation.parse(
                this.entityData.get(PROFILE_ID)
        );
    }

    // Retrieve the NPC's complete profile.
    public GwentPlayerProfile getProfile() {

        GwentPlayerProfile profile =
                GwentPlayerProfiles.get(getProfileId());

        // Use Aldric as a fallback if the profile is unavailable.
        if (profile == null) {
            return GwentPlayerProfiles.ALDRIC;
        }

        return profile;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        this.goalSelector.addGoal(0, new FloatGoal(this));

        this.goalSelector.addGoal(
                1,
                new LookAtPlayerGoal(this, Player.class, 8.0F)
        );

        this.goalSelector.addGoal(
                2,
                new RandomLookAroundGoal(this)
        );
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.FOLLOW_RANGE, 16.0D);
    }

    // Save the NPC's profile ID to its entity data.
    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);

        tag.putString(
                "GwentPlayerProfile",
                getProfileId().toString()
        );
    }

    // Restore the NPC's profile ID when the entity loads.
    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);

        if (tag.contains("GwentPlayerProfile")) {

            ResourceLocation profileId = ResourceLocation.parse(
                    tag.getString("GwentPlayerProfile")
            );

            GwentPlayerProfile profile =
                    GwentPlayerProfiles.get(profileId);

            if (profile != null) {
                setProfile(profileId);
            } else {
                setProfile(GwentPlayerProfiles.ALDRIC.id());
            }

        } else {
            setProfile(GwentPlayerProfiles.ALDRIC.id());
        }
    }

    // Handle right-click interactions.
    @Override
    public InteractionResult mobInteract(
            Player player,
            InteractionHand hand
    ) {
        if (hand == InteractionHand.MAIN_HAND) {

            if (!this.level().isClientSide) {

                GwentPlayerProfile profile = getProfile();

                player.displayClientMessage(
                        Component.literal(
                                profile.dialogue().greeting()
                        ),
                        false
                );
            }

            return InteractionResult.sidedSuccess(
                    this.level().isClientSide
            );
        }

        return super.mobInteract(player, hand);
    }
}