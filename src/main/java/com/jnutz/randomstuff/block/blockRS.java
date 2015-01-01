package com.jnutz.randomstuff.block;

import com.jnutz.randomstuff.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class blockRS extends Block {

    //Still not 100% Sure
    public blockRS(Material material){

        super(material);

    }

    //Sets up name based on MC Form
    @Override
    public String getUnlocalizedName(){

        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName){

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }


    //Sets up block texture
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){

        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));

    }
}
