package com.WWS.AlphaMod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = AlphaMod.MODID, version = AlphaMod.VERSION)
public class AlphaMod
{
    public static final String MODID = "WWS-1";
    public static final String VERSION = "1.904.205.486.000.094";

    public static Block walkwayBlock;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("WWS >> Alpha-094 Initializing...");
        System.out.println(AlphaMod.MODID);

        walkwayBlock = new WalkwayBlock();

        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(walkwayBlock), 0, new ModelResourceLocation(AlphaMod.MODID + ":" + ((WalkwayBlock)walkwayBlock).getName(), "inventory"));
        }
    }
    // Recipe Implementation Placeholder
}
