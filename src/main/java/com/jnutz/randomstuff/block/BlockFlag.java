package com.jnutz.randomstuff.block;

import com.jnutz.randomstuff.client.gui.PurpTab;
import com.jnutz.randomstuff.reference.Names;
import net.minecraft.block.material.Material;

public class BlockFlag extends blockRS {

    //Sets up new flag block
    public BlockFlag(Material material){

        super(material);
        this.setBlockName(Names.Blocks.FLAG);
        this.setBlockTextureName(Names.Blocks.FLAG);
        this.setCreativeTab(PurpTab.PurpleTab);
        this.setHardness(2.45f);

        //Arguments - What tool to break it? and level of tool required (0 = wood, 1 = stone, 2 = iron, 3 = diamond)
        this.setHarvestLevel("pickaxe", 0);

    }

}
