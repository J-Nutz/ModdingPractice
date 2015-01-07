package com.jnutz.randomstuff.block;

import com.jnutz.randomstuff.block.blockCores.blockRS;
import com.jnutz.randomstuff.reference.Names;
import net.minecraft.block.material.Material;

public class blockPurpleBlock extends blockRS {

    public blockPurpleBlock(Material material){

        super(material);
        this.setHardness(3.0f);
        this.setHarvestLevel("pickaxe", 0);
        this.setBlockName(Names.Blocks.PURPLE_BLOCK);
        this.setBlockTextureName(Names.Blocks.PURPLE_BLOCK);

    }
}
