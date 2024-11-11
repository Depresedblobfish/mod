package net.luke.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(4).fast()
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.GLOWING, 210), 1.0f).build();
}
