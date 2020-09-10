package com.congueror.carmoury.datagen;

import com.congueror.carmoury.CArmoury;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CArmoury.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators 
{
	@SubscribeEvent
    public static void gatherData(GatherDataEvent event) 
	{
		CArmoury.LOGGER.debug("Starting Server Data Generators");
        DataGenerator generator = event.getGenerator();
        
        if (event.includeServer()) 
        {
        	CArmoury.LOGGER.debug("Firing event for carmoury");
        	generator.addProvider(new RecipeDataGen(generator));
            //generator.addProvider(new LootTablesDataGen(generator));
            //generator.addProvider(new BlockTagsDataGen(generator));
            //generator.addProvider(new ItemTagsDataGen(generator));
        }
        if (event.includeClient()) 
        {
        	CArmoury.LOGGER.debug("Starting Client Data Generators");
        	//generator.addProvider(new BlockStatesDataGen(generator, ConguerorTools.MOD_ID, event.getExistingFileHelper()));
            generator.addProvider(new ItemModelDataGen(generator, CArmoury.MOD_ID, event.getExistingFileHelper()));
            //generator.addProvider(new LanguagesDataGen(generator, CArmoury.MOD_ID));
        }
    }
}
