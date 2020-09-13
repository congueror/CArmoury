package com.congueror.carmoury.datagen;

import java.util.function.Consumer;

import com.congueror.carmoury.init.ItemInit;
import com.congueror.clib.datagen.ModTags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;

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
        .key('a', ModTags.Items.INGOTS_TIN)
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_TIN)
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_TIN)
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_TIN)
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_TIN)
        .key('s', Items.STICK)
        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_TIN)
        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_TIN)
        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_TIN)
        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TIN_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_TIN)
        .addCriterion("tin_ingot", hasItem(ModTags.Items.INGOTS_TIN))
        .build(recipe);
		
		
		
		//Aluminum
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .key('s', Items.STICK)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .key('s', Items.STICK)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .key('s', Items.STICK)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .key('s', Items.STICK)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .key('s', Items.STICK)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ALUMINUM_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_ALUMINUM)
        .addCriterion("aluminum_ingot", hasItem(ModTags.Items.INGOTS_ALUMINUM))
        .build(recipe);
		
		//Steel
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_STEEL)
        .key('s', Items.STICK)
        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_STEEL)
        .key('s', Items.STICK)
        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_STEEL)
        .key('s', Items.STICK)
        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_STEEL)
        .key('s', Items.STICK)
        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_STEEL)
        .key('s', Items.STICK)
        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_STEEL)
        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_STEEL)
        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_STEEL)
        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.STEEL_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_STEEL)
        .addCriterion("steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
        .build(recipe);
		
		//Copper
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_COPPER)
        .key('s', Items.STICK)
        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_COPPER)
        .key('s', Items.STICK)
        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_COPPER)
        .key('s', Items.STICK)
        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_COPPER)
        .key('s', Items.STICK)
        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_COPPER)
        .key('s', Items.STICK)
        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_COPPER)
        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_COPPER)
        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_COPPER)
        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.COPPER_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_COPPER)
        .addCriterion("copper_ingot", hasItem(ModTags.Items.INGOTS_COPPER))
        .build(recipe);
		
		//Lead
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_LEAD)
        .key('s', Items.STICK)
        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_LEAD)
        .key('s', Items.STICK)
        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_LEAD)
        .key('s', Items.STICK)
        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_LEAD)
        .key('s', Items.STICK)
        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_LEAD)
        .key('s', Items.STICK)
        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_LEAD)
        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_LEAD)
        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_LEAD)
        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.LEAD_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_LEAD)
        .addCriterion("lead_ingot", hasItem(ModTags.Items.INGOTS_LEAD))
        .build(recipe);
		
		//Ruby
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.GEMS_RUBY)
        .key('s', Items.STICK)
        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.GEMS_RUBY)
        .key('s', Items.STICK)
        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.GEMS_RUBY)
        .key('s', Items.STICK)
        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.GEMS_RUBY)
        .key('s', Items.STICK)
        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.GEMS_RUBY)
        .key('s', Items.STICK)
        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.GEMS_RUBY)
        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.GEMS_RUBY)
        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.GEMS_RUBY)
        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.RUBY_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.GEMS_RUBY)
        .addCriterion("ruby_ingot", hasItem(ModTags.Items.GEMS_RUBY))
        .build(recipe);
		
		//Silver
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_SILVER)
        .key('s', Items.STICK)
        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_SILVER)
        .key('s', Items.STICK)
        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_SILVER)
        .key('s', Items.STICK)
        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_SILVER)
        .key('s', Items.STICK)
        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_SILVER)
        .key('s', Items.STICK)
        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_SILVER)
        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_SILVER)
        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_SILVER)
        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SILVER_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_SILVER)
        .addCriterion("silver_ingot", hasItem(ModTags.Items.INGOTS_SILVER))
        .build(recipe);
		
		//Nickel
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_NICKEL)
        .key('s', Items.STICK)
        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_NICKEL)
        .key('s', Items.STICK)
        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_NICKEL)
        .key('s', Items.STICK)
        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_NICKEL)
        .key('s', Items.STICK)
        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_NICKEL)
        .key('s', Items.STICK)
        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_NICKEL)
        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_NICKEL)
        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_NICKEL)
        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.NICKEL_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_NICKEL)
        .addCriterion("nickel_ingot", hasItem(ModTags.Items.INGOTS_NICKEL))
        .build(recipe);
		
		//Invar
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_INVAR)
        .key('s', Items.STICK)
        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_INVAR)
        .key('s', Items.STICK)
        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_INVAR)
        .key('s', Items.STICK)
        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_INVAR)
        .key('s', Items.STICK)
        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_INVAR)
        .key('s', Items.STICK)
        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_INVAR)
        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_INVAR)
        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_INVAR)
        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.INVAR_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_INVAR)
        .addCriterion("invar_ingot", hasItem(ModTags.Items.INGOTS_INVAR))
        .build(recipe);
		
		//Electrum
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_ELECTRUM)
        .key('s', Items.STICK)
        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_ELECTRUM)
        .key('s', Items.STICK)
        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_ELECTRUM)
        .key('s', Items.STICK)
        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_ELECTRUM)
        .key('s', Items.STICK)
        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_ELECTRUM)
        .key('s', Items.STICK)
        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_ELECTRUM)
        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_ELECTRUM)
        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_ELECTRUM)
        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ELECTRUM_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_ELECTRUM)
        .addCriterion("electrum_ingot", hasItem(ModTags.Items.INGOTS_ELECTRUM))
        .build(recipe);
		
		//Platinum
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_PLATINUM)
        .key('s', Items.STICK)
        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_PLATINUM)
        .key('s', Items.STICK)
        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_PLATINUM)
        .key('s', Items.STICK)
        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_PLATINUM)
        .key('s', Items.STICK)
        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_PLATINUM)
        .key('s', Items.STICK)
        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_PLATINUM)
        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_PLATINUM)
        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_PLATINUM)
        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.PLATINUM_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_PLATINUM)
        .addCriterion("platinum_ingot", hasItem(ModTags.Items.INGOTS_PLATINUM))
        .build(recipe);
		
		//Enderium
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_ENDERIUM)
        .key('s', Items.STICK)
        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_ENDERIUM)
        .key('s', Items.STICK)
        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_ENDERIUM)
        .key('s', Items.STICK)
        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_ENDERIUM)
        .key('s', Items.STICK)
        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_ENDERIUM)
        .key('s', Items.STICK)
        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_ENDERIUM)
        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_ENDERIUM)
        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_ENDERIUM)
        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.ENDERIUM_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_ENDERIUM)
        .addCriterion("enderium_ingot", hasItem(ModTags.Items.INGOTS_ENDERIUM))
        .build(recipe);
		
		//Tungsten
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
        .key('s', Items.STICK)
        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
        .key('s', Items.STICK)
        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
        .key('s', Items.STICK)
        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
        .key('s', Items.STICK)
        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
        .key('s', Items.STICK)
        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TUNGSTEN_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_TUNGSTEN)
        .addCriterion("tungsten_ingot", hasItem(ModTags.Items.INGOTS_TUNGSTEN))
        .build(recipe);
		
		//Bronze
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_BRONZE)
        .key('s', Items.STICK)
        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_BRONZE)
        .key('s', Items.STICK)
        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_BRONZE)
        .key('s', Items.STICK)
        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_BRONZE)
        .key('s', Items.STICK)
        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_BRONZE)
        .key('s', Items.STICK)
        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_BRONZE)
        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_BRONZE)
        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_BRONZE)
        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.BRONZE_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_BRONZE)
        .addCriterion("bronze_ingot", hasItem(ModTags.Items.INGOTS_BRONZE))
        .build(recipe);
		
		//Amethyst
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.GEMS_AMETHYST)
        .key('s', Items.STICK)
        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.GEMS_AMETHYST)
        .key('s', Items.STICK)
        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.GEMS_AMETHYST)
        .key('s', Items.STICK)
        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.GEMS_AMETHYST)
        .key('s', Items.STICK)
        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.GEMS_AMETHYST)
        .key('s', Items.STICK)
        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.GEMS_AMETHYST)
        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.GEMS_AMETHYST)
        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.GEMS_AMETHYST)
        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.AMETHYST_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.GEMS_AMETHYST)
        .addCriterion("amethyst", hasItem(ModTags.Items.GEMS_AMETHYST))
        .build(recipe);
		
		//Sapphire
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.GEMS_SAPPHIRE)
        .key('s', Items.STICK)
        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.GEMS_SAPPHIRE)
        .key('s', Items.STICK)
        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.GEMS_SAPPHIRE)
        .key('s', Items.STICK)
        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.GEMS_SAPPHIRE)
        .key('s', Items.STICK)
        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.GEMS_SAPPHIRE)
        .key('s', Items.STICK)
        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.GEMS_SAPPHIRE)
        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.GEMS_SAPPHIRE)
        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.GEMS_SAPPHIRE)
        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.SAPPHIRE_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.GEMS_SAPPHIRE)
        .addCriterion("sapphire", hasItem(ModTags.Items.GEMS_SAPPHIRE))
        .build(recipe);
		
		//Titanium
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_SWORD.get(), 1)
        .patternLine("a")
        .patternLine("a")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_TITANIUM)
        .key('s', Items.STICK)
        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_PICKAXE.get(), 1)
        .patternLine("aaa")
        .patternLine(" s ")
        .patternLine(" s ")
        .key('a', ModTags.Items.INGOTS_TITANIUM)
        .key('s', Items.STICK)
        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_AXE.get(), 1)
        .patternLine("aa")
        .patternLine("as")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_TITANIUM)
        .key('s', Items.STICK)
        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_SHOVEL.get(), 1)
        .patternLine("a")
        .patternLine("s")
        .patternLine("s")
        .key('a', ModTags.Items.INGOTS_TITANIUM)
        .key('s', Items.STICK)
        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_HOE.get(), 1)
        .patternLine("aa")
        .patternLine(" s")
        .patternLine(" s")
        .key('a', ModTags.Items.INGOTS_TITANIUM)
        .key('s', Items.STICK)
        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_HELMET.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_TITANIUM)
        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_CHESTPLATE.get(), 1)
        .patternLine("a a")
        .patternLine("aaa")
        .patternLine("aaa")
        .key('a', ModTags.Items.INGOTS_TITANIUM)
        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_LEGGINGS.get(), 1)
        .patternLine("aaa")
        .patternLine("a a")
        .patternLine("a a")
        .key('a', ModTags.Items.INGOTS_TITANIUM)
        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
        .build(recipe);
		
		ShapedRecipeBuilder.shapedRecipe(ItemInit.TITANIUM_BOOTS.get(), 1)
        .patternLine("a a")
        .patternLine("a a")
        .patternLine("   ")
        .key('a', ModTags.Items.INGOTS_TITANIUM)
        .addCriterion("titanium_ingot", hasItem(ModTags.Items.INGOTS_TITANIUM))
        .build(recipe);
	}
}
