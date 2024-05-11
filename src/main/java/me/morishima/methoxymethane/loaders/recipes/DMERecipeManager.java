package me.morishima.methoxymethane.loaders.recipes;

import gregtech.api.recipes.RecipeMaps;
import me.morishima.methoxymethane.loaders.recipes.chemical.DMEChemicalEnhanceRecipes;
import me.morishima.methoxymethane.loaders.recipes.handler.DMEComponentHandler;
import me.morishima.methoxymethane.loaders.recipes.handler.DMEMaterialHandler;
import me.morishima.methoxymethane.loaders.recipes.machines.DMECasingRecipes;
import me.morishima.methoxymethane.loaders.recipes.machines.DMEFoilPlatingRecipes;

public class DMERecipeManager {

    public static void initPost() {
        DMEMiscRecipes.init();
        DMEChemicalEnhanceRecipes.init();
        DMERecipeRewrite.init();
        DMEFoilPlatingRecipes.init();
        DMEMachineRecipes.init();
        DMECasingRecipes.init();
        DMEComponentHandler.registerMotor();
        DMEMaterialHandler.init();
    }

    public static void initPre() {
        DMECraftingComponent.rewriteCraftingComponent();
    }

    public static void changeInject() {
        RecipeMaps.COMPRESSOR_RECIPES.setMaxInputs(2);
    }

}
