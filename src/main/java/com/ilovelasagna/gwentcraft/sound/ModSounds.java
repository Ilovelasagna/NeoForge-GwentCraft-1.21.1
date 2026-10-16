package com.ilovelasagna.gwentcraft.sound;

import com.ilovelasagna.gwentcraft.GwentCraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, GwentCraft.MOD_ID);

    public static final Supplier<SoundEvent> KEG_USE = registerSoundEvent( "keg_use");

    public static final Supplier<SoundEvent> JOB_BLOCK_BREAK = registerSoundEvent("job_block_break");
    public static final Supplier<SoundEvent> JOB_BLOCK_STEP = registerSoundEvent("job_block_step");
    public static final Supplier<SoundEvent> JOB_BLOCK_PLACE = registerSoundEvent("job_block_place");
    public static final Supplier<SoundEvent> JOB_BLOCK_HIT = registerSoundEvent("job_block_hit");
    public static final Supplier<SoundEvent> JOB_BLOCK_FALL = registerSoundEvent("job_block_fall");

    public static final DeferredSoundType JOB_BLOCK_SOUNDS = new DeferredSoundType(1f,1f,
            ModSounds.JOB_BLOCK_BREAK,ModSounds.JOB_BLOCK_STEP,ModSounds.JOB_BLOCK_PLACE,
            ModSounds.JOB_BLOCK_HIT,ModSounds.JOB_BLOCK_FALL);



    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(GwentCraft.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register (IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}
