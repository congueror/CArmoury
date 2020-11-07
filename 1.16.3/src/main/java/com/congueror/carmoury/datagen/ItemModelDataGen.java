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
		
		//Lead
		singleTexture(ItemInit.LEAD_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/lead_sword"));
		
		singleTexture(ItemInit.LEAD_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/lead_pickaxe"));
		
		singleTexture(ItemInit.LEAD_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/lead_axe"));
		
		singleTexture(ItemInit.LEAD_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/lead_shovel"));
		
		singleTexture(ItemInit.LEAD_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/lead_hoe"));
		
		singleTexture(ItemInit.LEAD_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/lead_helmet"));
		
		singleTexture(ItemInit.LEAD_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/lead_chestplate"));
		
		singleTexture(ItemInit.LEAD_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/lead_leggings"));
		
		singleTexture(ItemInit.LEAD_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/lead_boots"));
		
		//Ruby
		singleTexture(ItemInit.RUBY_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/ruby_sword"));
		
		singleTexture(ItemInit.RUBY_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/ruby_pickaxe"));
		
		singleTexture(ItemInit.RUBY_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/ruby_axe"));
		
		singleTexture(ItemInit.RUBY_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/ruby_shovel"));
		
		singleTexture(ItemInit.RUBY_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/ruby_hoe"));
		
		singleTexture(ItemInit.RUBY_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/ruby_helmet"));
		
		singleTexture(ItemInit.RUBY_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/ruby_chestplate"));
		
		singleTexture(ItemInit.RUBY_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/ruby_leggings"));
		
		singleTexture(ItemInit.RUBY_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/ruby_boots"));
		
		//Silver
		singleTexture(ItemInit.SILVER_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/silver_sword"));
		
		singleTexture(ItemInit.SILVER_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/silver_pickaxe"));
		
		singleTexture(ItemInit.SILVER_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/silver_axe"));
		
		singleTexture(ItemInit.SILVER_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/silver_shovel"));
		
		singleTexture(ItemInit.SILVER_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/silver_hoe"));
		
		singleTexture(ItemInit.SILVER_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/silver_helmet"));
		
		singleTexture(ItemInit.SILVER_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/silver_chestplate"));
		
		singleTexture(ItemInit.SILVER_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/silver_leggings"));
		
		singleTexture(ItemInit.SILVER_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/silver_boots"));
		
		//Nickel
		singleTexture(ItemInit.NICKEL_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/nickel_sword"));
		
		singleTexture(ItemInit.NICKEL_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/nickel_pickaxe"));
		
		singleTexture(ItemInit.NICKEL_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/nickel_axe"));
		
		singleTexture(ItemInit.NICKEL_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/nickel_shovel"));
		
		singleTexture(ItemInit.NICKEL_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/nickel_hoe"));
		
		singleTexture(ItemInit.NICKEL_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/nickel_helmet"));
		
		singleTexture(ItemInit.NICKEL_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/nickel_chestplate"));
		
		singleTexture(ItemInit.NICKEL_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/nickel_leggings"));
		
		singleTexture(ItemInit.NICKEL_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/nickel_boots"));
		
		//Invar
		singleTexture(ItemInit.INVAR_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/invar_sword"));
		
		singleTexture(ItemInit.INVAR_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/invar_pickaxe"));
		
		singleTexture(ItemInit.INVAR_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/invar_axe"));
		
		singleTexture(ItemInit.INVAR_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/invar_shovel"));
		
		singleTexture(ItemInit.INVAR_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/invar_hoe"));
		
		singleTexture(ItemInit.INVAR_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/invar_helmet"));
		
		singleTexture(ItemInit.INVAR_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/invar_chestplate"));
		
		singleTexture(ItemInit.INVAR_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/invar_leggings"));
		
		singleTexture(ItemInit.INVAR_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/invar_boots"));
		
		//Electrum
		singleTexture(ItemInit.ELECTRUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/electrum_sword"));
		
		singleTexture(ItemInit.ELECTRUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/electrum_pickaxe"));
		
		singleTexture(ItemInit.ELECTRUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/electrum_axe"));
		
		singleTexture(ItemInit.ELECTRUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/electrum_shovel"));
		
		singleTexture(ItemInit.ELECTRUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/electrum_hoe"));
		
		singleTexture(ItemInit.ELECTRUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/electrum_helmet"));
		
		singleTexture(ItemInit.ELECTRUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/electrum_chestplate"));
		
		singleTexture(ItemInit.ELECTRUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/electrum_leggings"));
		
		singleTexture(ItemInit.ELECTRUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/electrum_boots"));
		
		//Platinum
		singleTexture(ItemInit.PLATINUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/platinum_sword"));
		
		singleTexture(ItemInit.PLATINUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/platinum_pickaxe"));
		
		singleTexture(ItemInit.PLATINUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/platinum_axe"));
		
		singleTexture(ItemInit.PLATINUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/platinum_shovel"));
		
		singleTexture(ItemInit.PLATINUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/platinum_hoe"));
		
		singleTexture(ItemInit.PLATINUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/platinum_helmet"));
		
		singleTexture(ItemInit.PLATINUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/platinum_chestplate"));
		
		singleTexture(ItemInit.PLATINUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/platinum_leggings"));
		
		singleTexture(ItemInit.PLATINUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/platinum_boots"));
		
		//Enderium
		singleTexture(ItemInit.ENDERIUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/enderium_sword"));
		
		singleTexture(ItemInit.ENDERIUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/enderium_pickaxe"));
		
		singleTexture(ItemInit.ENDERIUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/enderium_axe"));
		
		singleTexture(ItemInit.ENDERIUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/enderium_shovel"));
		
		singleTexture(ItemInit.ENDERIUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/enderium_hoe"));
		
		singleTexture(ItemInit.ENDERIUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/enderium_helmet"));
		
		singleTexture(ItemInit.ENDERIUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/enderium_chestplate"));
		
		singleTexture(ItemInit.ENDERIUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/enderium_leggings"));
		
		singleTexture(ItemInit.ENDERIUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/enderium_boots"));
		
		//Tungsten
		singleTexture(ItemInit.TUNGSTEN_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tungsten_sword"));
		
		singleTexture(ItemInit.TUNGSTEN_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tungsten_pickaxe"));
		
		singleTexture(ItemInit.TUNGSTEN_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tungsten_axe"));
		
		singleTexture(ItemInit.TUNGSTEN_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tungsten_shovel"));
		
		singleTexture(ItemInit.TUNGSTEN_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tungsten_hoe"));
		
		singleTexture(ItemInit.TUNGSTEN_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tungsten_helmet"));
		
		singleTexture(ItemInit.TUNGSTEN_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tungsten_chestplate"));
		
		singleTexture(ItemInit.TUNGSTEN_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tungsten_leggings"));
		
		singleTexture(ItemInit.TUNGSTEN_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/tungsten_boots"));
		
		//Bronze
		singleTexture(ItemInit.BRONZE_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/bronze_sword"));
		
		singleTexture(ItemInit.BRONZE_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/bronze_pickaxe"));
		
		singleTexture(ItemInit.BRONZE_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/bronze_axe"));
		
		singleTexture(ItemInit.BRONZE_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/bronze_shovel"));
		
		singleTexture(ItemInit.BRONZE_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/bronze_hoe"));
		
		singleTexture(ItemInit.BRONZE_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/bronze_helmet"));
		
		singleTexture(ItemInit.BRONZE_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/bronze_chestplate"));
		
		singleTexture(ItemInit.BRONZE_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/bronze_leggings"));
		
		singleTexture(ItemInit.BRONZE_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/bronze_boots"));
		
		//Amethyst
		singleTexture(ItemInit.AMETHYST_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/amethyst_sword"));
		
		singleTexture(ItemInit.AMETHYST_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/amethyst_pickaxe"));
		
		singleTexture(ItemInit.AMETHYST_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/amethyst_axe"));
		
		singleTexture(ItemInit.AMETHYST_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/amethyst_shovel"));
		
		singleTexture(ItemInit.AMETHYST_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/amethyst_hoe"));
		
		singleTexture(ItemInit.AMETHYST_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/amethyst_helmet"));
		
		singleTexture(ItemInit.AMETHYST_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/amethyst_chestplate"));
		
		singleTexture(ItemInit.AMETHYST_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/amethyst_leggings"));
		
		singleTexture(ItemInit.AMETHYST_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/amethyst_boots"));
		
		//Sapphire
		singleTexture(ItemInit.SAPPHIRE_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/sapphire_sword"));
		
		singleTexture(ItemInit.SAPPHIRE_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/sapphire_pickaxe"));
		
		singleTexture(ItemInit.SAPPHIRE_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/sapphire_axe"));
		
		singleTexture(ItemInit.SAPPHIRE_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/sapphire_shovel"));
		
		singleTexture(ItemInit.SAPPHIRE_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/sapphire_hoe"));
		
		singleTexture(ItemInit.SAPPHIRE_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/sapphire_helmet"));
		
		singleTexture(ItemInit.SAPPHIRE_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/sapphire_chestplate"));
		
		singleTexture(ItemInit.SAPPHIRE_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/sapphire_leggings"));
		
		singleTexture(ItemInit.SAPPHIRE_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/sapphire_boots"));
		
		//Titanium
		singleTexture(ItemInit.TITANIUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/titanium_sword"));
		
		singleTexture(ItemInit.TITANIUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/titanium_pickaxe"));
		
		singleTexture(ItemInit.TITANIUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/titanium_axe"));
		
		singleTexture(ItemInit.TITANIUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/titanium_shovel"));
		
		singleTexture(ItemInit.TITANIUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/titanium_hoe"));
		
		singleTexture(ItemInit.TITANIUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/titanium_helmet"));
		
		singleTexture(ItemInit.TITANIUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/titanium_chestplate"));
		
		singleTexture(ItemInit.TITANIUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/titanium_leggings"));
		
		singleTexture(ItemInit.TITANIUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/titanium_boots"));
		
		//Zinc
		singleTexture(ItemInit.ZINC_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/zinc_sword"));
		
		singleTexture(ItemInit.ZINC_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/zinc_pickaxe"));
		
		singleTexture(ItemInit.ZINC_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/zinc_axe"));
		
		singleTexture(ItemInit.ZINC_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/zinc_shovel"));
		
		singleTexture(ItemInit.ZINC_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/zinc_hoe"));
		
		singleTexture(ItemInit.ZINC_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/zinc_helmet"));
		
		singleTexture(ItemInit.ZINC_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/zinc_chestplate"));
		
		singleTexture(ItemInit.ZINC_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/zinc_leggings"));
		
		singleTexture(ItemInit.ZINC_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/zinc_boots"));
		
		//Cobalt
		singleTexture(ItemInit.COBALT_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/cobalt_sword"));
		
		singleTexture(ItemInit.COBALT_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/cobalt_pickaxe"));
		
		singleTexture(ItemInit.COBALT_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/cobalt_axe"));
		
		singleTexture(ItemInit.COBALT_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/cobalt_shovel"));
		
		singleTexture(ItemInit.COBALT_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/cobalt_hoe"));
		
		singleTexture(ItemInit.COBALT_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/cobalt_helmet"));
		
		singleTexture(ItemInit.COBALT_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/cobalt_chestplate"));
		
		singleTexture(ItemInit.COBALT_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/cobalt_leggings"));
		
		singleTexture(ItemInit.COBALT_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/cobalt_boots"));
		
		//Brass
		singleTexture(ItemInit.BRASS_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/brass_sword"));
		
		singleTexture(ItemInit.BRASS_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/brass_pickaxe"));
		
		singleTexture(ItemInit.BRASS_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/brass_axe"));
		
		singleTexture(ItemInit.BRASS_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/brass_shovel"));
		
		singleTexture(ItemInit.BRASS_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/brass_hoe"));
		
		singleTexture(ItemInit.BRASS_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/brass_helmet"));
		
		singleTexture(ItemInit.BRASS_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/brass_chestplate"));
		
		singleTexture(ItemInit.BRASS_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/brass_leggings"));
		
		singleTexture(ItemInit.BRASS_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/brass_boots"));
		
		//Chromium
		singleTexture(ItemInit.CHROMIUM_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/chromium_sword"));
		
		singleTexture(ItemInit.CHROMIUM_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/chromium_pickaxe"));
		
		singleTexture(ItemInit.CHROMIUM_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/chromium_axe"));
		
		singleTexture(ItemInit.CHROMIUM_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/chromium_shovel"));
		
		singleTexture(ItemInit.CHROMIUM_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/chromium_hoe"));
		
		singleTexture(ItemInit.CHROMIUM_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/chromium_helmet"));
		
		singleTexture(ItemInit.CHROMIUM_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/chromium_chestplate"));
		
		singleTexture(ItemInit.CHROMIUM_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/chromium_leggings"));
		
		singleTexture(ItemInit.CHROMIUM_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),
                "layer0", new ResourceLocation(CArmoury.MOD_ID, "items/chromium_boots"));
	}
}