package com.congueror.carmoury.util;

import com.congueror.carmoury.CArmoury;
import com.congueror.carmoury.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class CArmouryItemGroup extends ItemGroup
{
	public static final CArmouryItemGroup instance = new CArmouryItemGroup(ItemGroup.GROUPS.length, "carmourytab");
	private CArmouryItemGroup(int index, String label) 
	{
		super(index, label);
		this.setBackgroundImageName("carmoury_item_search.png");
	}
	
	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemInit.TIN_CHESTPLATE.get());
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	@Override
	public int getSearchbarWidth() {
		return 88;
	}
	
	@Override
	public ResourceLocation getTabsImage() {
		return new ResourceLocation(CArmoury.MOD_ID, "textures/gui/carmoury_tabs.png");
	}
}