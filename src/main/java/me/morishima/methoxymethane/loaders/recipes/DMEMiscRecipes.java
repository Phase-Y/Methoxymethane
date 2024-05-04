package me.morishima.methoxymethane.loaders.recipes;

import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.common.items.MetaItems;
import me.morishima.methoxymethane.common.blocks.DMEBlocks;
import me.morishima.methoxymethane.common.blocks.metablock.DMEBlockMultiblock;
import me.morishima.methoxymethane.common.items.DMEMetaItems;
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
    }

}
