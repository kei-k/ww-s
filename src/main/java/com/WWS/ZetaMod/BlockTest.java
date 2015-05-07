package com.WWS.ZetaMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockTest extends Block
{
    private final String name = "Test Block";
    public BlockTest()
    {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setUnlocalizedName(name);
        setHardness(4.0f);
        setResistance(5.0f);
        setCreativeTab(CreativeTabs.tabBlock);
    }

    public String getName()
    {
        return name;
    }
}
