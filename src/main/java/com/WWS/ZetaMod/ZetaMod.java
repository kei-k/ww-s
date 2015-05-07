package com.WWS.ZetaMod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ZetaMod.MODID, version = ZetaMod.VERSION)
public class ZetaMod
{
    public static final String MODID = "WWS-7";
    public static final String VERSION = "7.904.205.486.000.094";

    public static Block testBlock;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("WWS - Zeta >> "+Blocks.dirt.getUnlocalizedName());
        System.out.println("WWS - Zeta >> Has Finished Loading!");
        System.out.println(ZetaMod.MODID);

        testBlock = new BlockTest();

        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(testBlock), 0, new ModelResourceLocation(ZetaMod.MODID + ":" + ((BlockTest) testBlock).getName(), "inventory"));
        }

        GameRegistry.addRecipe(new ItemStack(ZetaMod.testBlock), new Object[]{
                "AAA",
                "AAA",
                "AAA",
                'A', Items.cookie
        });
    }
}