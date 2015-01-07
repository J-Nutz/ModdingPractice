package com.jnutz.randomstuff.item.itemCores;

import com.jnutz.randomstuff.client.gui.PurpTab;
import com.jnutz.randomstuff.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class itemFoodRS extends ItemFood{

    public itemFoodRS(String unlocalizedName,int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects){

        super(healAmount, saturationModifier, wolvesFavorite);
        setCreativeTab(PurpTab.PurpleTab);

    }

    /** Setting Name In MC Form For All Items Based Off This Class **/
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

    /** Setting Texture For All Items Based Off This Class **/
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){

        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));

    }

}
