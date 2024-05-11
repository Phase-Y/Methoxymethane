package me.morishima.methoxymethane.loaders.recipes.machines;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import me.morishima.methoxymethane.common.blocks.DMEBlocks;
import me.morishima.methoxymethane.common.blocks.metablock.DMEBlockMultiblock;

public class DMECasingRecipes {

    public static void init() {
        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(Materials.Rubber.getFluid(1000))
                .input(OrePrefix.frameGt, Materials.Steel)
                .outputs(DMEBlocks.MULTIBLOCK_BLOCKS.getItemVariant(DMEBlockMultiblock.BlockType.DIELECTRIC_RUBBER_CASING))
                .EUt(8).duration(200)
                .buildAndRegister();
    }

}
