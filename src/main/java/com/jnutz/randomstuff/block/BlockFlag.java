package com.jnutz.randomstuff.block;

import com.jnutz.randomstuff.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFlag extends blockRS {

    //Sets up new flag block
    public BlockFlag(){

        super();
        this.setBlockName(Names.Blocks.FLAG);
        this.setBlockTextureName(Names.Blocks.FLAG);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setHardness(2.25f);

        //Arguments - What tool to break it? and level of tool required
        this.setHarvestLevel("pickaxe", 2);

    }

}
