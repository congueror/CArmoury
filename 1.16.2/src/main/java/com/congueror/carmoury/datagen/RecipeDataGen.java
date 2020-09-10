package com.congueror.carmoury.datagen;

import java.util.function.Consumer;

import com.congueror.carmoury.init.ItemInit;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;

@SuppressWarnings("unused")
public class RecipeDataGen extends RecipeProvider
{
	public RecipeDataGen(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> recipe) {
		//Tin
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', com.congueror.clib.init.ItemInit.TIN_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', com.congueror.clib.init.ItemInit.TIN_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', com.congueror.clib.init.ItemInit.TIN_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', com.congueror.clib.init.ItemInit.TIN_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', com.congueror.clib.init.ItemInit.TIN_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', com.congueror.clib.init.ItemInit.TIN_INGOT.get())
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', com.congueror.clib.init.ItemInit.TIN_INGOT.get())
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', com.congueror.clib.init.ItemInit.TIN_INGOT.get())
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', com.congueror.clib.init.ItemInit.TIN_INGOT.get())
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.TIN_INGOT.get()))
        .build(recipe);
		
		
		
		//Aluminum
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get())
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get())
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get())
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get())
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get())
        .addCriterion("tin_ingot", hasItem(com.congueror.clib.init.ItemInit.ALUMINUM_INGOT.get()))
        .build(recipe);
	}
}
