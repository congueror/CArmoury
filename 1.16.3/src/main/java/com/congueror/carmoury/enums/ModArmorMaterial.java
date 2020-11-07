package com.congueror.carmoury.enums;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

import com.congueror.carmoury.CArmoury;
import com.congueror.clib.init.ItemInit;

public enum ModArmorMaterial implements IArmorMaterial
{
	//Name,
	//MaxDamageFactor(Leather = 5, Iron = 15, Diamond = 33, Netherite = 37),
	//Armor Amount(Leather = {1,2,3,1}, Iron = {2,5,6,2}, Diamond = {3,6,8,3}),
	//Enchantibility(Leather = 15, Iron = 9, Diamond = 10, Netherite = 15),
	//Sound,
	//Toughness,
	//Knockback Resistance 
	TIN(CArmoury.MOD_ID + ":tin", 10, new int[] {2, 3, 4, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.TIN_INGOT.get());
	}),
	
	ALUMINUM(CArmoury.MOD_ID + ":aluminum", 14, new int[] {3, 4, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.ALUMINUM_INGOT.get());
	}),
	
	STEEL(CArmoury.MOD_ID + ":steel", 29, new int[] {2, 5, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.5f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.STEEL_INGOT.get());
	}),
	
	COPPER(CArmoury.MOD_ID + ":copper", 12, new int[] {2, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.COPPER_INGOT.get());
	}),
	
	LEAD(CArmoury.MOD_ID + ":lead", 13, new int[] {2, 5, 6, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.LEAD_INGOT.get());
	}),
	
	RUBY(CArmoury.MOD_ID + ":ruby", 33, new int[] {4, 6, 8, 4}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.RUBY.get());
	}),
	
	SILVER(CArmoury.MOD_ID + ":silver", 30, new int[] {3, 6, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.SILVER_INGOT.get());
	}),
	
	NICKEL(CArmoury.MOD_ID + ":nickel", 14, new int[] {2, 5, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.NICKEL_INGOT.get());
	}),
	
	INVAR(CArmoury.MOD_ID + ":invar", 15, new int[] {2, 5, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.INVAR_INGOT.get());
	}),
	
	ELECTRUM(CArmoury.MOD_ID + ":electrum", 17, new int[] {2, 3, 4, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.ELECTRUM_INGOT.get());
	}),
	
	PLATINUM(CArmoury.MOD_ID + ":platinum", 32, new int[] {3, 5, 7, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.PLATINUM_INGOT.get());
	}),
	
	ENDERIUM(CArmoury.MOD_ID + ":enderium", 37, new int[] {4, 7, 8, 4}, 7, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0f, 0.2f, () -> {
		return Ingredient.fromItems(ItemInit.ENDERIUM_INGOT.get());
	}),
	
	TUNGSTEN(CArmoury.MOD_ID + ":tungsten", 29, new int[] {3, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.TUNGSTEN_INGOT.get());
	}),
	
	BRONZE(CArmoury.MOD_ID + ":bronze", 12, new int[] {2, 4, 5, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.BRONZE_INGOT.get());
	}),
	
	AMETHYST(CArmoury.MOD_ID + ":amethyst", 33, new int[] {4, 6, 8, 4}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.AMETHYST.get());
	}),
	
	SAPPHIRE(CArmoury.MOD_ID + ":sapphire", 33, new int[] {4, 6, 8, 4}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.SAPPHIRE.get());
	}),
	
	TITANIUM(CArmoury.MOD_ID + ":titanium", 38, new int[] {4, 8, 10, 4}, 3, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.5f, 0.4f, () -> {
		return Ingredient.fromItems(ItemInit.TITANIUM_INGOT.get());
	}),
	
	ZINC(CArmoury.MOD_ID + ":zinc", 14, new int[] {2, 5, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.ZINC_INGOT.get());
	}),
	
	COBALT(CArmoury.MOD_ID + ":cobalt", 38, new int[] {4, 8, 10, 4}, 3, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.5f, 0.4f, () -> {
		return Ingredient.fromItems(ItemInit.COBALT_INGOT.get());
	}),
	
	BRASS(CArmoury.MOD_ID + ":brass", 16, new int[] {2, 6, 6, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.BRASS_INGOT.get());
	}),
	
	CHROMIUM(CArmoury.MOD_ID + ":chromium", 16, new int[] {2, 6, 6, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.CHROMIUM_INGOT.get());
	}),
	;
	
	private static int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantibility;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantiblityIn, SoundEvent soundEventIn, float toughnessIn, float knockbackResistance, Supplier<Ingredient> repairMaterialIn) {
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountIn;
		this.enchantibility = enchantiblityIn;
		this.soundEvent = soundEventIn;
		this.toughness = toughnessIn;
		this.knockbackResistance = knockbackResistance;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}
	
	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
	
	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}


	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
