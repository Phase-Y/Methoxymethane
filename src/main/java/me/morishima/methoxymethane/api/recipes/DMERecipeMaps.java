package me.morishima.methoxymethane.api.recipes;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

public class DMERecipeMaps {

    public static final RecipeMap<SimpleRecipeBuilder> PLATTER = new RecipeMap<>("platter", 2, 1, 1, 0, new SimpleRecipeBuilder(), false);

    public static final RecipeMap<SimpleRecipeBuilder> CLOP = new RecipeMap<>("clop", 3, 3, 2, 2, new SimpleRecipeBuilder(), false);
}
