package me.morishima.methoxymethane.loaders.recipes;

import gregicality.multiblocks.api.fluids.GCYMFluidStorageKeys;
import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import me.morishima.methoxymethane.common.blocks.DMEBlocks;
import me.morishima.methoxymethane.common.blocks.metablock.DMEBlockMultiblock;
import me.morishima.methoxymethane.common.blocks.metablock.DMETransparentCasing;
import me.morishima.methoxymethane.common.items.DMEMetaItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DMEMiscRecipes {

    public static void init() {
        ModHandler.addShapedRecipe("insulating_silicon_bricks",
                DMEBlocks.MULTIBLOCK_BLOCKS.getItemVariant(DMEBlockMultiblock.BlockType.INSULATING_SILICON_BRICKS),
                "h  ", "AA ", "AA ",
                'A', DMEMetaItems.Misc.INSULATING_SILICON_BRICK
        );

        ModHandler.addShapelessRecipe("is_raw_brick", DMEMetaItems.Misc.BRICK_BLANK.getStackForm(),
                "dustGeneralSiliconDioxide",
                "dustGeneralSiliconDioxide",
                "dustGeneralSiliconDioxide",
                "dustGeneralSiliconDioxide",
                "dustGeneralSiliconDioxide",
                "dustGeneralSiliconDioxide",
                "dustGeneralSiliconDioxide",
                new ItemStack(Items.CLAY_BALL),
                new ItemStack(Items.WATER_BUCKET)
        );

        RecipeMaps.COMPRESSOR_RECIPES.recipeBuilder()
                .input(DMEMetaItems.Misc.BRICK_BLANK)
                .notConsumable(MetaItems.WOODEN_FORM_BRICK)
                .output(DMEMetaItems.Misc.RAW_INSULATING_SILICON_BRICK)
                .EUt(4)
                .duration(80)
                .buildAndRegister();

        ModHandler.addSmeltingRecipe(DMEMetaItems.Misc.RAW_INSULATING_SILICON_BRICK.getStackForm(), DMEMetaItems.Misc.INSULATING_SILICON_BRICK.getStackForm());

        ModHandler.addShapedRecipe("mixed_alloy_plate", DMEMetaItems.Misc.MIXED_ALLOY_PLATE.getStackForm(2),
                "AAA", "BBB", "CCC",
                'A', "plateTin",
                'B', "plateCopper",
                'C', "plateIron"
        );

        RecipeMaps.COMPRESSOR_RECIPES.recipeBuilder()
                .input(DMEMetaItems.Misc.MIXED_ALLOY_PLATE)
                .fluidInputs(Materials.Oxygen.getFluid(100))
                .output(DMEMetaItems.Misc.RESISTANCE_ALLOY_PLATE)
                .EUt(8).duration(40)
                .buildAndRegister();

        RecipeMaps.ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(OrePrefix.dust, Materials.Glass, 3)
                .input(DMEMetaItems.Misc.RESISTANCE_ALLOY_PLATE)
                .outputs(DMEBlocks.TRANSPARENT_CASING.getItemVariant(DMETransparentCasing.CasingType.REINFORCED_GLASS, 4))
                .duration(400).EUt(4)
                .buildAndRegister();

        RecipeMaps.ALLOY_SMELTER_RECIPES.recipeBuilder()
                .input(Blocks.GLASS, 3)
                .input(DMEMetaItems.Misc.RESISTANCE_ALLOY_PLATE)
                .outputs(DMEBlocks.TRANSPARENT_CASING.getItemVariant(DMETransparentCasing.CasingType.REINFORCED_GLASS, 4))
                .duration(400).EUt(4)
                .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
                .input(Blocks.GLASS)
                .fluidInputs(Materials.BorosilicateGlass.getFluid(1000))
                .outputs(DMEBlocks.TRANSPARENT_CASING.getItemVariant(DMETransparentCasing.CasingType.BOROSILICATE_TEMPERED_GLASS))
                .duration(100).EUt((int) GTValues.V[GTValues.MV])
                .buildAndRegister();

        RecipeMaps.CANNER_RECIPES.recipeBuilder()
                .input(Blocks.GLASS)
                .fluidInputs(Materials.TungstenSteel.getFluid(GCYMFluidStorageKeys.MOLTEN, 100))
                .outputs(DMEBlocks.TRANSPARENT_CASING.getItemVariant(DMETransparentCasing.CasingType.TUNGSTEN_STEEL_REE_GLASS))
                .duration(100).EUt((int) GTValues.V[GTValues.EV])
                .buildAndRegister();
    }

}
