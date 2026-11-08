package com.ilovelasagna.gwentcraft.entity.profile;

import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class GwentPlayerProfiles {

    private static final Map<ResourceLocation, GwentPlayerProfile> PROFILES =
            new HashMap<>();

    // Aldric - Beginner Gwent Player
    public static final GwentPlayerProfile ALDRIC = register(
            new GwentPlayerProfile(
                    ResourceLocation.fromNamespaceAndPath(
                            "gwentcraft", "Test"
                    ),

                    "Test",

                    ResourceLocation.fromNamespaceAndPath(
                            "gwentcraft", "textures/entity/Test.png"
                    ),

                    GwentPlayerProfile.Difficulty.BEGINNER,

                    ResourceLocation.fromNamespaceAndPath(
                            "gwentcraft", "starter_monster"
                    ),

                    new GwentPlayerProfile.Dialogue(
                            "Up for a game of Gwent?",
                            "Let's see what you've got!",
                            "Well played! You've earned this.",
                            "Better luck next time!"
                    ),

                    java.util.List.of(
                            new GwentPlayerProfile.Reward(
                                    ResourceLocation.fromNamespaceAndPath(
                                            "minecraft", "emerald"
                                    ),
                                    5
                            )
                    )
            )
    );

    // Register a new NPC profile.
    public static GwentPlayerProfile register(
            GwentPlayerProfile profile
    ) {
        if (PROFILES.containsKey(profile.id())) {
            throw new IllegalArgumentException(
                    "Duplicate Gwent Player profile: " + profile.id()
            );
        }

        PROFILES.put(profile.id(), profile);

        return profile;
    }

    // Retrieve an NPC profile by its ID.
    public static GwentPlayerProfile get(
            ResourceLocation id
    ) {
        return PROFILES.get(id);
    }

    // Check whether a profile exists.
    public static boolean exists(ResourceLocation id) {
        return PROFILES.containsKey(id);
    }
}