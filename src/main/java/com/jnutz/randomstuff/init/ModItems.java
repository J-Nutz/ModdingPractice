package com.jnutz.randomstuff.init;

import com.jnutz.randomstuff.item.itemMapleLeaf;
import com.jnutz.randomstuff.item.itemRS;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Jonah on 12/27/2014.
 */
public class ModItems {

    public static final itemRS mapleLeaf = new itemMapleLeaf();

    public static void init(){

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");

    }

}
