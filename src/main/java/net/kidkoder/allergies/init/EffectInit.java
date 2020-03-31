package net.kidkoder.allergies.init;

import net.kidkoder.allergies.potion.effect.EffectAllergicReaction;
import net.minecraft.potion.Effect;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class EffectInit {

        public static Effect EFFECT_ALLERGIC_REACTION;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Effect> event) {

        event.getRegistry().registerAll(

                EFFECT_ALLERGIC_REACTION = new EffectAllergicReaction()

        );

    }
}