package me.morishima.methoxymethane.loaders.recipes;


import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtechfoodoption.GTFOMaterialHandler;

import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;

public class DMEChemicalEnhanceRecipes {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .input(OrePrefix.dust, Materials.PhosphorusPentoxide)
                .fluidInputs(Materials.Ethanol.getFluid(3000))
                .fluidOutputs(Materials.Ethylene.getFluid(2000))
                .fluidOutputs(Materials.PhosphoricAcid.getFluid(1000))
                .EUt(16).duration(150)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Materials.Ethanol.getFluid(1000), Materials.Oxygen.getFluid(1000))
                .notConsumable(OrePrefix.dust, Materials.Copper)
                .fluidOutputs(GTFOMaterialHandler.Acetaldehyde.getFluid(1000), Materials.Water.getFluid(1000))
                .EUt(32).duration(120)
                .buildAndRegister();
    }

}
