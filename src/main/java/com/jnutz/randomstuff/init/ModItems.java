package com.jnutz.randomstuff.init;

import com.jnutz.randomstuff.item.itemMapleLeaf;
import com.jnutz.randomstuff.item.itemPoopSword;
import com.jnutz.randomstuff.item.itemRS;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static final itemRS mapleLeaf = new itemMapleLeaf();
    public static final itemRS poopSword = new itemPoopSword();

    public static void init(){

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(poopSword, "poopSword");

    }

}
