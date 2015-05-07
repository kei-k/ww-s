package com.WWS.AlphaMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WalkwayBlock extends Block
{
    private final String walkwayName = "Walkway";
    public WalkwayBlock()
    {
        super(Material.rock);
        GameRegistry.registerBlock(this, walkwayName);
        setUnlocalizedName(walkwayName);
        setHardness(5.0f);
        setResistance(5.0f);
        setCreativeTab(CreativeTabs.tabTransport);
    }

    public String getName(){
        return walkwayName;
    }
}
