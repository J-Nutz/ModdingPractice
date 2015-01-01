package com.jnutz.randomstuff.client.gui;

import com.jnutz.randomstuff.init.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PurpCreativeTabs extends CreativeTabs{

    public PurpCreativeTabs(){

        super("PurpleTab");

    }

    @SideOnly(Side.CLIENT)
    public Item getTabIconItem(){

        return ModItems.poopSword;

    }
}
