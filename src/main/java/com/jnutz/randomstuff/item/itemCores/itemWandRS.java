package com.jnutz.randomstuff.item.itemCores;

import com.jnutz.randomstuff.client.gui.PurpTab;
import com.jnutz.randomstuff.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class itemWandRS extends Item {

    public itemWandRS() {

        super();
        setCreativeTab(PurpTab.PurpleTab);
        setMaxStackSize(1);

    }

    //Setting Name In MC Form
    @Override
    public String getUnlocalizedName(){

        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()) );

    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){

        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName){

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }

    //Setting Image To Same As Name
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){

        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));

    }

}
