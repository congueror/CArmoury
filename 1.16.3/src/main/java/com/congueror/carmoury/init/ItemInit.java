package com.congueror.carmoury.init;

import com.congueror.carmoury.CArmoury;
import com.congueror.carmoury.enums.ModArmorMaterial;
import com.congueror.carmoury.enums.ModItemTier;
import com.congueror.carmoury.util.CArmouryItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	//AttackDamage = Tier + init + 1		AttackSpeed = float + 4
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CArmoury.MOD_ID);
	
	//Tin
	public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", ()-> new SwordItem(ModItemTier.TIN, 3, -2.2f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", ()-> new PickaxeItem(ModItemTier.TIN, 1, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", ()-> new AxeItem(ModItemTier.TIN, 6.0f, -3.3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", ()-> new ShovelItem(ModItemTier.TIN, 1.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", ()-> new HoeItem(ModItemTier.TIN, 0, -2f, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Aluminum
	public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword", ()-> new SwordItem(ModItemTier.ALUMINUM, 5, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe", ()-> new PickaxeItem(ModItemTier.ALUMINUM, 3, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe", ()-> new AxeItem(ModItemTier.ALUMINUM, 8.0f, -3.1f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel", ()-> new ShovelItem(ModItemTier.ALUMINUM, 3.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe", ()-> new HoeItem(ModItemTier.ALUMINUM, 0, -2, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Steel
	public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", ()-> new SwordItem(ModItemTier.STEEL, 6, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", ()-> new PickaxeItem(ModItemTier.STEEL, 4, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", ()-> new AxeItem(ModItemTier.STEEL, 9.0f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", ()-> new ShovelItem(ModItemTier.STEEL, 4.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", ()-> new HoeItem(ModItemTier.STEEL, 0, -0f, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Copper
	public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", ()-> new SwordItem(ModItemTier.COPPER, 4, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", ()-> new PickaxeItem(ModItemTier.COPPER, 2, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", ()-> new AxeItem(ModItemTier.COPPER, 7.0f, -3.2f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", ()-> new ShovelItem(ModItemTier.COPPER, 2.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", ()-> new HoeItem(ModItemTier.COPPER, 0, -2, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Lead
	public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register("lead_sword", ()-> new SwordItem(ModItemTier.LEAD, 5, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", ()-> new PickaxeItem(ModItemTier.LEAD, 3, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> LEAD_AXE = ITEMS.register("lead_axe", ()-> new AxeItem(ModItemTier.LEAD, 8.0f, -3.2f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel", ()-> new ShovelItem(ModItemTier.LEAD, 3.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> LEAD_HOE = ITEMS.register("lead_hoe", ()-> new HoeItem(ModItemTier.LEAD, 0, -1, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register("lead_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.LEAD, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.LEAD, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register("lead_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.LEAD, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> LEAD_BOOTS = ITEMS.register("lead_boots", ()-> 
		new ArmorItem(ModArmorMaterial.LEAD, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Ruby
	public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", ()-> new SwordItem(ModItemTier.RUBY, 6, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", ()-> new PickaxeItem(ModItemTier.RUBY, 4, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", ()-> new AxeItem(ModItemTier.RUBY, 9.0f, -3.2f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", ()-> new ShovelItem(ModItemTier.RUBY, 4.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", ()-> new HoeItem(ModItemTier.RUBY, 0, 0, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", ()-> 
		new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Silver
	public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", ()-> new SwordItem(ModItemTier.SILVER, 6, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", ()-> new PickaxeItem(ModItemTier.SILVER, 4, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", ()-> new AxeItem(ModItemTier.SILVER, 9.0f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", ()-> new ShovelItem(ModItemTier.SILVER, 4.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe", ()-> new HoeItem(ModItemTier.SILVER, 0, 0, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots", ()-> 
		new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Nickel
	public static final RegistryObject<Item> NICKEL_SWORD = ITEMS.register("nickel_sword", ()-> new SwordItem(ModItemTier.NICKEL, 4, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> NICKEL_PICKAXE = ITEMS.register("nickel_pickaxe", ()-> new PickaxeItem(ModItemTier.NICKEL, 2, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> NICKEL_AXE = ITEMS.register("nickel_axe", ()-> new AxeItem(ModItemTier.NICKEL, 7.0f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> NICKEL_SHOVEL = ITEMS.register("nickel_shovel", ()-> new ShovelItem(ModItemTier.NICKEL, 2.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> NICKEL_HOE = ITEMS.register("nickel_hoe", ()-> new HoeItem(ModItemTier.NICKEL, 0, -3, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> NICKEL_HELMET = ITEMS.register("nickel_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.NICKEL, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> NICKEL_CHESTPLATE = ITEMS.register("nickel_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.NICKEL, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> NICKEL_LEGGINGS = ITEMS.register("nickel_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.NICKEL, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> NICKEL_BOOTS = ITEMS.register("nickel_boots", ()-> 
		new ArmorItem(ModArmorMaterial.NICKEL, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Invar
	public static final RegistryObject<Item> INVAR_SWORD = ITEMS.register("invar_sword", ()-> new SwordItem(ModItemTier.INVAR, 4, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> INVAR_PICKAXE = ITEMS.register("invar_pickaxe", ()-> new PickaxeItem(ModItemTier.INVAR, 2, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> INVAR_AXE = ITEMS.register("invar_axe", ()-> new AxeItem(ModItemTier.INVAR, 7.0f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> INVAR_SHOVEL = ITEMS.register("invar_shovel", ()-> new ShovelItem(ModItemTier.INVAR, 2.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> INVAR_HOE = ITEMS.register("invar_hoe", ()-> new HoeItem(ModItemTier.INVAR, 0, -3, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> INVAR_HELMET = ITEMS.register("invar_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.INVAR, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> INVAR_CHESTPLATE = ITEMS.register("invar_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.INVAR, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> INVAR_LEGGINGS = ITEMS.register("invar_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.INVAR, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> INVAR_BOOTS = ITEMS.register("invar_boots", ()-> 
		new ArmorItem(ModArmorMaterial.INVAR, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Electrum
	public static final RegistryObject<Item> ELECTRUM_SWORD = ITEMS.register("electrum_sword", ()-> new SwordItem(ModItemTier.ELECTRUM, 5, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ELECTRUM_PICKAXE = ITEMS.register("electrum_pickaxe", ()-> new PickaxeItem(ModItemTier.ELECTRUM, 3, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ELECTRUM_AXE = ITEMS.register("electrum_axe", ()-> new AxeItem(ModItemTier.ELECTRUM, 8.0f, -3.1f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ELECTRUM_SHOVEL = ITEMS.register("electrum_shovel", ()-> new ShovelItem(ModItemTier.ELECTRUM, 3.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ELECTRUM_HOE = ITEMS.register("electrum_hoe", ()-> new HoeItem(ModItemTier.ELECTRUM, 0, -3, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> ELECTRUM_HELMET = ITEMS.register("electrum_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.ELECTRUM, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ELECTRUM_CHESTPLATE = ITEMS.register("electrum_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.ELECTRUM, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ELECTRUM_LEGGINGS = ITEMS.register("electrum_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.ELECTRUM, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ELECTRUM_BOOTS = ITEMS.register("electrum_boots", ()-> 
		new ArmorItem(ModArmorMaterial.ELECTRUM, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Platinum
	public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", ()-> new SwordItem(ModItemTier.PLATINUM, 6, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", ()-> new PickaxeItem(ModItemTier.PLATINUM, 4, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", ()-> new AxeItem(ModItemTier.PLATINUM, 9.0f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", ()-> new ShovelItem(ModItemTier.PLATINUM, 4.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", ()-> new HoeItem(ModItemTier.PLATINUM, 0, -3, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots", ()-> 
		new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Enderium
	public static final RegistryObject<Item> ENDERIUM_SWORD = ITEMS.register("enderium_sword", ()-> new SwordItem(ModItemTier.ENDERIUM, 8, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ENDERIUM_PICKAXE = ITEMS.register("enderium_pickaxe", ()-> new PickaxeItem(ModItemTier.ENDERIUM, 6, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ENDERIUM_AXE = ITEMS.register("enderium_axe", ()-> new AxeItem(ModItemTier.ENDERIUM, 11.0f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ENDERIUM_SHOVEL = ITEMS.register("enderium_shovel", ()-> new ShovelItem(ModItemTier.ENDERIUM, 6.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ENDERIUM_HOE = ITEMS.register("enderium_hoe", ()-> new HoeItem(ModItemTier.ENDERIUM, 0, -3, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> ENDERIUM_HELMET = ITEMS.register("enderium_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.ENDERIUM, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ENDERIUM_CHESTPLATE = ITEMS.register("enderium_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.ENDERIUM, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ENDERIUM_LEGGINGS = ITEMS.register("enderium_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.ENDERIUM, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ENDERIUM_BOOTS = ITEMS.register("enderium_boots", ()-> 
		new ArmorItem(ModArmorMaterial.ENDERIUM, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Tungsten
	public static final RegistryObject<Item> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword", ()-> new SwordItem(ModItemTier.TUNGSTEN, 5, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe", ()-> new PickaxeItem(ModItemTier.TUNGSTEN, 3, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe", ()-> new AxeItem(ModItemTier.TUNGSTEN, 8.0f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel", ()-> new ShovelItem(ModItemTier.TUNGSTEN, 3.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe", ()-> new HoeItem(ModItemTier.TUNGSTEN, 0, -3, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots", ()-> 
		new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Bronze
	public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", ()-> new SwordItem(ModItemTier.BRONZE, 5, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", ()-> new PickaxeItem(ModItemTier.BRONZE, 3, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", ()-> new AxeItem(ModItemTier.BRONZE, 8.0f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", ()-> new ShovelItem(ModItemTier.BRONZE, 3.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", ()-> new HoeItem(ModItemTier.BRONZE, 0, -3, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", ()-> 
		new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Amethyst
	public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", ()-> new SwordItem(ModItemTier.AMETHYST, 6, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", ()-> new PickaxeItem(ModItemTier.AMETHYST, 4, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", ()-> new AxeItem(ModItemTier.AMETHYST, 9.0f, -3.2f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", ()-> new ShovelItem(ModItemTier.AMETHYST, 4.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", ()-> new HoeItem(ModItemTier.AMETHYST, 0, 0, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", ()-> 
		new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Sapphire
	public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", ()-> new SwordItem(ModItemTier.SAPPHIRE, 6, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", ()-> new PickaxeItem(ModItemTier.SAPPHIRE, 4, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", ()-> new AxeItem(ModItemTier.SAPPHIRE, 9.0f, -3.2f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", ()-> new ShovelItem(ModItemTier.SAPPHIRE, 4.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", ()-> new HoeItem(ModItemTier.SAPPHIRE, 0, 0, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", ()-> 
		new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Titanium
	public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", ()-> new SwordItem(ModItemTier.TITANIUM, 8, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", ()-> new PickaxeItem(ModItemTier.TITANIUM, 2, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", ()-> new AxeItem(ModItemTier.TITANIUM, 11.0f, -3.2f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", ()-> new ShovelItem(ModItemTier.TITANIUM, 6.5f, -3f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", ()-> new HoeItem(ModItemTier.TITANIUM, 0, 0, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots", ()-> 
		new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
}
