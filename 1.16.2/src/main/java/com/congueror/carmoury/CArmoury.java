package com.congueror.carmoury;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.congueror.carmoury.init.ItemInit;


@Mod("carmoury")
@Mod.EventBusSubscriber(modid = "carmoury", bus = Mod.EventBusSubscriber.Bus.MOD)
public class CArmoury
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "carmoury";
    public static CArmoury instance;

    public CArmoury() {
    	
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        modEventBus.addListener(this::doClientStuff);
        
        CArmoury.instance = this;
        ItemInit.ITEMS.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SuppressWarnings("resource")
	private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }
}
