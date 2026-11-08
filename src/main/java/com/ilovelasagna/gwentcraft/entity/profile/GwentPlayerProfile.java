package com.ilovelasagna.gwentcraft.entity.profile;

import net.minecraft.resources.ResourceLocation;

import java.util.List;

public record GwentPlayerProfile(

        ResourceLocation id,
        String name,
        ResourceLocation texture,
        Difficulty difficulty,
        ResourceLocation deck,
        Dialogue dialogue,
        List<Reward> rewards

) {

    public GwentPlayerProfile {
        rewards = List.copyOf(rewards);
    }

    public enum Difficulty {
        BEGINNER,
        INTERMEDIATE,
        ADVANCED,
        EXPERT
    }

    public record Dialogue(
            String greeting,
            String challenge,
            String victory,
            String defeat
    ) {}

    public record Reward(
            ResourceLocation item,
            int count
    ) {}
}