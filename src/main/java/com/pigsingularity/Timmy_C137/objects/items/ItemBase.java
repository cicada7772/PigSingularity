package com.pigsingularity.Timmy_C137.objects.items;

import com.pigsingularity.Timmy_C137.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.pigsingularity.Timmy_C137.main;
import com.pigsingularity.Timmy_C137.util.interfaces.IHasModel;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }


    @Override
    public void registerModels()
    {
        main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
