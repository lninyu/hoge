package com.lninyu.lninyumod;

import com.lninyu.lninyumod.Blocks.TestBlock1;
import com.lninyu.lninyumod.Blocks.mBlocks;
//import com.lninyu.lninyumod.setup.ClientProxy;
//import com.lninyu.lninyumod.setup.IProxy;
//import com.lninyu.lninyumod.setup.ServerProxy;
//import net.minecraftforge.fml.DistExecutor;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("lninyumod")
public class LninyuMod {
    //public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    private static final Logger LOGGER = LogManager.getLogger();
    public LninyuMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("hello minecraft!");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new TestBlock1());
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new BlockItem(mBlocks.TBLOCK1, new Item.Properties()).setRegistryName("testblock1"));
        }
    }
}
