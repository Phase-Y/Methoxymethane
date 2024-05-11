package me.morishima.methoxymethane.loaders.recipes.handler;

import gregtech.api.GTValues;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.blocks.MetaBlocks;
import me.morishima.methoxymethane.api.recipes.DMERecipeMaps;
import me.morishima.methoxymethane.api.unification.material.DMEMaterials;

public class DMEMaterialHandler {

    public static void init() {
        cosmicNeu();
    }

    public static void cosmicNeu() {
        RecipeMaps.IMPLOSION_RECIPES.recipeBuilder()
                .input(MetaBlocks.ITNT, 128)
                .input(OrePrefix.dust, DMEMaterials.CosmicNeutronium)
                .output(OrePrefix.ingotHot, DMEMaterials.CosmicNeutronium)
                .duration(1).EUt(524288)
                .buildAndRegister();

        RecipeMaps.VACUUM_RECIPES.recipeBuilder()
                .input(OrePrefix.ingotHot, DMEMaterials.CosmicNeutronium)
                .output(OrePrefix.ingot, DMEMaterials.CosmicNeutronium)
                .duration(500).EUt((int) GTValues.V[GTValues.UV])
                .buildAndRegister();

        DMERecipeMaps.CLOP.recipeBuilder()
                .notConsumable(OrePrefix.lens, Materials.NetherStar)
                .notConsumable(OrePrefix.dustTiny, Materials.Neutronium)
                .circuitMeta(1)
                .fluidInputs(Materials.Ice.getFluid(10000))
                .output(OrePrefix.dustTiny, DMEMaterials.CosmicNeutronium)
                .EUt(5600).duration(1)
                .buildAndRegister();

        DMERecipeMaps.CLOP.recipeBuilder()
                .notConsumable(OrePrefix.lens, Materials.NetherStar)
                .notConsumable(OrePrefix.dustTiny, Materials.Neutronium)
                .circuitMeta(2)
                .fluidInputs(Materials.Ice.getFluid(10000))
                .output(OrePrefix.dust, DMEMaterials.CosmicNeutronium)
                .EUt(5600).duration(9)
                .buildAndRegister();
    }

}
