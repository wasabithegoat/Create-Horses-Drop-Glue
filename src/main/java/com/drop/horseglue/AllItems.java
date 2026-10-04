package com.drop.horseglue;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.world.item.Item;

/**
 * Item registration.
 */
public class AllItems {

    public static final ItemEntry<Item> HORSE_GLUE = HorseGlue.REGISTRATE
            .item("horse_glue", Item::new)
            .lang("Horse Hoof")
            .register();

    public static void register() {
        // Force class loading to trigger Registrate calls
    }
}