package com.jnutz.randomstuff.item;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class materials extends Item {


    //Constructors
    //String Name
    //int harvest level (0-3)
    //int uses
    //float efficiency
    //float damage (hearts_you_want_to_deal/2)
    //int enchantability

    //All Materials For Items
    public static Item.ToolMaterial poopMat = EnumHelper.addToolMaterial("poopMat", 0, 250, 1.0f, 2.0f, 20);


}
