package com.jnutz.randomstuff.init;

import com.jnutz.randomstuff.block.BlockFlag;
import com.jnutz.randomstuff.block.blockRS;
import com.jnutz.randomstuff.reference.Names;
import com.jnutz.randomstuff.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    //Sets up new blocks
    public static final blockRS flag = new BlockFlag();

    //Registering Blocks
    public static void init(){

        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
    }

}
