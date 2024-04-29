package me.morishima.methoxymethane.loaders.recipes;

import gregtech.api.recipes.RecipeMaps;

public class DMERecipeManager {

    public static void init() {
        DMEMiscRecipes.init();
        DMEChemicalEnhanceRecipes.init();
        DMEMiscRecipes.init();
        DMERecipeRewrite.init();
    }

    public static void changeInject() {
        RecipeMaps.COMPRESSOR_RECIPES.setMaxInputs(2);
    }

}
