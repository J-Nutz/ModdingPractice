package com.jnutz.randomstuff.init;

import com.jnutz.randomstuff.block.BlockFlag;
import com.jnutz.randomstuff.block.blockRS;
import com.jnutz.randomstuff.block.purpleOre;
import com.jnutz.randomstuff.item.purpleIngot;
import com.jnutz.randomstuff.reference.Names;
import com.jnutz.randomstuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    //Sets up new blocks
    public static final blockRS flag = new BlockFlag(Material.rock);
    public static final BlockOre purpleOre = new purpleOre();

    public static void preInit(){

        //Registering Blocks
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
        GameRegistry.registerBlock(purpleOre, Names.Ores.PURPLE_ORE);

        //Registering Smelting Recipes
        GameRegistry.addSmelting(ModBlocks.purpleOre, new ItemStack(ModItems.purpleIngot), 0.5f);

    }
}
