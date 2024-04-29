package me.morishima.methoxymethane.loaders.recipes;

import com.google.common.collect.Lists;
import gregtech.api.GTValues;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import me.morishima.methoxymethane.api.unification.material.DMEMaterials;

import java.util.Collections;
import java.util.Objects;

public class DMERecipeRewrite {

    public static void init() {
        RecipeMaps.ASSEMBLER_RECIPES.removeRecipe(Objects.requireNonNull(RecipeMaps.ASSEMBLER_RECIPES.findRecipe(GTValues.V[GTValues.LV], Lists.newArrayList(OreDictUnifier.get(OrePrefix.dust, Materials.Wood), IntCircuitIngredient.getIntegratedCircuit(1)), Collections.singletonList(Materials.Glue.getFluid(50)))));

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .input(OrePrefix.dust, Materials.Wood)
                .circuitMeta(1)
                .fluidInputs(DMEMaterials.PhenolicResin.getFluid(50))
                .output(MetaItems.PHENOLIC_BOARD)
                .EUt(30).duration(150)
                .buildAndRegister();
    }

}
