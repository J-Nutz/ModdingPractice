package com.jnutz.randomstuff.init;

import com.jnutz.randomstuff.food.candyCane;
import com.jnutz.randomstuff.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ModItems {

    //Initiating Items
    public static final itemRS mapleLeaf = new itemMapleLeaf();
    public static final itemRS purpleIngot = new purpleIngot();
    public static final ItemSword poopSword = new itemPoopSword(itemMaterials.poopMat);

    //Initiating Foods

    //Constructors First int = food regenerated/2
    //float = saturation
    //boolean = wolvesFavorite ?
    //Potion Effect Constructors
    //Potion name
    //How many ticks it lasts (2 ticks in a second)
    //Then what level of potion it is (0 = 1/default)

    public static final ItemFood candyCane = new candyCane("candyCane", 4, 0.3f, false,
            new PotionEffect(Potion.moveSpeed.id, 200, 0),
            new PotionEffect(Potion.jump.id, 200, 0)
    );


    //Registering Items
    public static void preInit(){

        //Items
        //Constructors
        //Item Name
        //MC String Name
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(poopSword, "poopSword");
        GameRegistry.registerItem(purpleIngot, "purpleIngot");

        //Foods
        GameRegistry.registerItem(candyCane, "candyCane");

    }

}
