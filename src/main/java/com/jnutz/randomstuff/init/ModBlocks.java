package com.jnutz.randomstuff.init;

import com.jnutz.randomstuff.block.*;
import com.jnutz.randomstuff.reference.Names;
import com.jnutz.randomstuff.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    /** Sets up new blocks **/
    public static final blockRS flag = new BlockFlag(Material.rock);
    public static final BlockOre purpleOre = new blockPurpleOre();
    public static final blockRS purpleBlock = new blockPurpleBlock(Material.rock);

    /** To call in preInit in main mod class **/
    public static void preInit(){

        /** Registering Blocks **/
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
        GameRegistry.registerBlock(purpleOre, Names.Ores.PURPLE_ORE);
        GameRegistry.registerBlock(purpleBlock, "purpleBlock");

        /** Registering Smelting Recipes **/
        GameRegistry.addSmelting(ModBlocks.purpleOre, new ItemStack(ModItems.purpleIngot), 0.5f);

    }

    public static void craftingPreInit(){

        ItemStack purpleIngot = new ItemStack(ModItems.purpleIngot);

        GameRegistry.addRecipe(new ItemStack(ModBlocks.purpleBlock), "xxx", "xxx", "xxx",
                'x', purpleIngot);

    }
}
