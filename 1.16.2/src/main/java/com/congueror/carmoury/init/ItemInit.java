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
	public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", ()-> new SwordItem(ModItemTier.TIN, 3, -2, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", ()-> new PickaxeItem(ModItemTier.TIN, 2, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", ()-> new AxeItem(ModItemTier.TIN, 7.0f, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", ()-> new ShovelItem(ModItemTier.TIN, 2.5f, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", ()-> new HoeItem(ModItemTier.TIN, 0, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", ()-> 
		new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Aluminum
	public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword", ()-> new SwordItem(ModItemTier.ALUMINUM, 5, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe", ()-> new PickaxeItem(ModItemTier.ALUMINUM, 4, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe", ()-> new AxeItem(ModItemTier.ALUMINUM, 9.0f, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel", ()-> new ShovelItem(ModItemTier.ALUMINUM, 4.5f, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe", ()-> new HoeItem(ModItemTier.ALUMINUM, 0, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots", ()-> 
		new ArmorItem(ModArmorMaterial.ALUMINUM, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Steel
	public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", ()-> new SwordItem(ModItemTier.STEEL, 6, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", ()-> new PickaxeItem(ModItemTier.STEEL, 5, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", ()-> new AxeItem(ModItemTier.STEEL, 10.0f, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", ()-> new ShovelItem(ModItemTier.STEEL, 5.5f, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", ()-> new HoeItem(ModItemTier.STEEL, 0, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", ()-> 
		new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
	
	//Copper
	public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", ()-> new SwordItem(ModItemTier.COPPER, 4, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", ()-> new PickaxeItem(ModItemTier.COPPER, 3, -2.4f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", ()-> new AxeItem(ModItemTier.COPPER, 8.0f, -2.8f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", ()-> new ShovelItem(ModItemTier.COPPER, 3.5f, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", ()-> new HoeItem(ModItemTier.COPPER, 0, -2.6f, new Item.Properties().group(CArmouryItemGroup.instance)));
		
	public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(CArmouryItemGroup.instance)));
	public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", ()-> 
		new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(CArmouryItemGroup.instance)));
}
