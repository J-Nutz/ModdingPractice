package com.jnutz.randomstuff.init;

import com.jnutz.randomstuff.item.ItemPoop;
import com.jnutz.randomstuff.item.food.*;
import com.jnutz.randomstuff.item.ingots.ItemPurpleIngot;
import com.jnutz.randomstuff.item.itemCores.*;
import com.jnutz.randomstuff.item.tools.ItemPoopSword;
import com.jnutz.randomstuff.item.tools.ItemPurpleAxe;
import com.jnutz.randomstuff.item.tools.ItemPurplePickAxe;


import com.jnutz.randomstuff.item.utilities.ItemDayWand;
import com.jnutz.randomstuff.item.utilities.ItemNightWand;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ModItems {

    /** Initiating Items **/
    public static final itemIngotRS purpleIngot = new ItemPurpleIngot();
    public static final ItemSword poopSword = new ItemPoopSword(itemMaterials.poopMat);
    public static final ItemPickaxe purplePickaxe = new ItemPurplePickAxe(itemMaterials.purpleMat);
    public static final ItemAxe purpleAxe = new ItemPurpleAxe(itemMaterials.purpleMat);
    public static final itemRS poop = new ItemPoop();
    public static final itemWandRS dayWand = new ItemDayWand();
    public static final itemWandRS nightWand = new ItemNightWand();

    /** Initiating Foods **/
    public static final ItemFood candyCane = new CandyCane("candyCane", 4, 0.3f, false,
            new PotionEffect(Potion.moveSpeed.id, 200, 0),
            new PotionEffect(Potion.jump.id, 200, 0)
    );


    /** Registering Items **/
    public static void preInit(){

        /** Items **/
        GameRegistry.registerItem(poopSword, "poopSword");
        GameRegistry.registerItem(purpleIngot, "purpleIngot");
        GameRegistry.registerItem(purplePickaxe, "purplePickaxe");
        GameRegistry.registerItem(purpleAxe, "purpleAxe");
        GameRegistry.registerItem(poop, "poop");
        GameRegistry.registerItem(dayWand, "dayWand");
        GameRegistry.registerItem(nightWand, "nightWand");

        /** Foods **/
        GameRegistry.registerItem(candyCane, "candyCane");

    }

}
