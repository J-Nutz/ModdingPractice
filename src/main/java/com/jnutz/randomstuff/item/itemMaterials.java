package com.jnutz.randomstuff.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class itemMaterials extends Item {


    //Constructors
    //String Name
    //int harvest level (0-3)
    //int uses
    //float efficiency
    //float damage (hearts_you_want_to_deal/2)
    //int enchantability

    //All Materials For Items
    public static Item.ToolMaterial poopMat = EnumHelper.addToolMaterial("poopMat", 0, 250, 1.0f, 2.0f, 10);
    public static Item.ToolMaterial purpleMat = EnumHelper.addToolMaterial("purpleMat", 2, 750, 6.5f, 2.5f, 25);

    //All Materials For Armour
    public static ItemArmor.ArmorMaterial purpleArmMat = EnumHelper.addArmorMaterial("purpleMat", 650, new int[] {3, 6, 5 ,3}, 15 );

}
