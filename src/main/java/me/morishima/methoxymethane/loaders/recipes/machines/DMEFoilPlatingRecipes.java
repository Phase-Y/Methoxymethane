package me.morishima.methoxymethane.loaders.recipes.machines;

import gregtech.api.GTValues;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import me.morishima.methoxymethane.api.recipes.DMERecipeMaps;
import me.morishima.methoxymethane.api.unification.material.DMEMaterials;

public class DMEFoilPlatingRecipes {

    public static void init() {
        DMERecipeMaps.PLATTER.recipeBuilder()
                .input(OrePrefix.ingot, Materials.Osmiridium)
                .input(OrePrefix.foil, Materials.TungstenSteel, 2)
                .fluidInputs(DMEMaterials.PlatingLiquid.getFluid(100))
                .output(OrePrefix.ingot, DMEMaterials.TungstensteelPlatedOsmiridium)
                .EUt((int) GTValues.V[GTValues.EV]).duration(80)
                .buildAndRegister();
    }

}
