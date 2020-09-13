package com.congueror.carmoury.items;

import net.minecraft.entity.CreatureAttribute;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class SilverSwordItem extends SwordItem{

	public SilverSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
		super(tier, attackDamageIn, attackSpeedIn, builderIn);
	}

	public float getAttackDamage(float attackDamage, CreatureAttribute creatureType) {
		if (this.getAttackDamage() == 0) {
	         return 1.0F + (float)Math.max(0, attackDamage - 1) * 0.5F;
	      } else if (this.getAttackDamage() == 1 && creatureType == CreatureAttribute.UNDEAD) {
	         return attackDamage * 2.5F;
	      } else {
	         return this.getAttackDamage() == 2 && creatureType == CreatureAttribute.ARTHROPOD ? attackDamage * 2.5F : 0.0F;
	      }
	}
}
