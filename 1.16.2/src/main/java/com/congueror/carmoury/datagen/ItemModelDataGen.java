package com.congueror.carmoury.datagen;


import com.congueror.carmoury.CArmoury;
import com.congueror.carmoury.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelDataGen extends ItemModelProvider 
{

	public ItemModelDataGen(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, CArmoury.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		//Tin
		singleTexture(ItemInit.TIN_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tin_sword"));
		
		singleTexture(ItemInit.TIN_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tin_pickaxe"));
		
		singleTexture(ItemInit.TIN_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tin_axe"));
		
		singleTexture(ItemInit.TIN_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tin_shovel"));
		
		singleTexture(ItemInit.TIN_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tin_hoe"));
		
		singleTexture(ItemInit.TIN_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tin_helmet"));
		
		singleTexture(ItemInit.TIN_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tin_chestplate"));
		
		singleTexture(ItemInit.TIN_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tin_leggings"));
		
		singleTexture(ItemInit.TIN_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tin_boots"));
		
		//Aluminum
		singleTexture(ItemInit.ALUMINUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/aluminum_sword"));
		
		singleTexture(ItemInit.ALUMINUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/aluminum_pickaxe"));
		
		singleTexture(ItemInit.ALUMINUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/aluminum_axe"));
		
		singleTexture(ItemInit.ALUMINUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/aluminum_shovel"));
		
		singleTexture(ItemInit.ALUMINUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/aluminum_hoe"));
		
		singleTexture(ItemInit.ALUMINUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/aluminum_helmet"));
		
		singleTexture(ItemInit.ALUMINUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/aluminum_chestplate"));
		
		singleTexture(ItemInit.ALUMINUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/aluminum_leggings"));
		
		singleTexture(ItemInit.ALUMINUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/aluminum_boots"));
		
		//Steel
		singleTexture(ItemInit.STEEL_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/steel_sword"));
		
		singleTexture(ItemInit.STEEL_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/steel_pickaxe"));
		
		singleTexture(ItemInit.STEEL_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/steel_axe"));
		
		singleTexture(ItemInit.STEEL_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/steel_shovel"));
		
		singleTexture(ItemInit.STEEL_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/steel_hoe"));
		
		singleTexture(ItemInit.STEEL_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/steel_helmet"));
		
		singleTexture(ItemInit.STEEL_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/steel_chestplate"));
		
		singleTexture(ItemInit.STEEL_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/steel_leggings"));
		
		singleTexture(ItemInit.STEEL_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/steel_boots"));
		
		//Copper
		singleTexture(ItemInit.COPPER_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/copper_sword"));
		
		singleTexture(ItemInit.COPPER_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/copper_pickaxe"));
		
		singleTexture(ItemInit.COPPER_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/copper_axe"));
		
		singleTexture(ItemInit.COPPER_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/copper_shovel"));
		
		singleTexture(ItemInit.COPPER_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/copper_hoe"));
		
		singleTexture(ItemInit.COPPER_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/copper_helmet"));
		
		singleTexture(ItemInit.COPPER_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/copper_chestplate"));
		
		singleTexture(ItemInit.COPPER_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/copper_leggings"));
		
		singleTexture(ItemInit.COPPER_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/copper_boots"));
	}
}
