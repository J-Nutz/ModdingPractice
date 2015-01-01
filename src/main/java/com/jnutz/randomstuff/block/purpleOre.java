package com.jnutz.randomstuff.block;

import com.jnutz.randomstuff.reference.Names;
import com.jnutz.randomstuff.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class purpleOre extends BlockOre {

    public purpleOre() {

        super();
        this.setBlockTextureName(Names.Ores.PURPLE_ORE);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(2.5f);
        this.setBlockName(Names.Ores.PURPLE_ORE);


    }

    //Sets up name based on MC Form
    @Override
    public String getUnlocalizedName() {

        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }

    //Sets up block texture
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){

        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));

    }
}
