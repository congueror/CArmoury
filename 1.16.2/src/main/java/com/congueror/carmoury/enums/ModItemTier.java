package com.congueror.carmoury.enums;

import java.util.function.Supplier;

import com.congueror.clib.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTier implements IItemTier
{
	//HarvestLvl,
	//Durability(Wood = 59, Iron = 250, Diamond = 1561, Netherite = 2031),
	//Efficiency(Wood = 2.0, Iron = 6.0, Diamond = 8.0),
	//Attack Damage(Wood = 0),
	//Enchantibility(Wood = 15),
	//RepairMat
	TIN(1, 72, 2.5f, 0.0f, 14, () -> {
		return Ingredient.fromItems(ItemInit.TIN_INGOT.get());
	}),
	
	ALUMINUM(2, 234, 5.7f, 0.0f, 10, () -> {
		return Ingredient.fromItems(ItemInit.ALUMINUM_INGOT.get());
	}),
	
	STEEL(2, 1306, 7.0f, 0.0f, 8, () -> {
		return Ingredient.fromItems(ItemInit.STEEL_INGOT.get());
	}),
	
	COPPER(2, 131, 3.0f, 0.0f, 13, () -> {
		return Ingredient.fromItems(ItemInit.COPPER_INGOT.get());
	}),
	
	
	
	RUBY(2, 1569, 9.0f, 3.0f, 5, () -> {
		return Ingredient.fromItems(ItemInit.RUBY.get());
	}),
	
	LEAD(2, 1268, 6.5f, 2.0f, 8, () -> {
		return Ingredient.fromItems(ItemInit.LEAD_INGOT.get());
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantibility;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial) 
	{
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantibility = enchantibility;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getMaxUses() {
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
}
