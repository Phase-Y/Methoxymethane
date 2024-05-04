package me.morishima.methoxymethane.loaders.recipes;

import gregtech.api.GTValues;
import me.morishima.methoxymethane.common.blocks.DMEBlocks;
import me.morishima.methoxymethane.common.blocks.metablock.DMETransparentCasing;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static gregtech.loaders.recipe.CraftingComponent.GLASS;

public class DMECraftingComponent {

    public static void rewriteCraftingComponent() {
        GLASS.appendIngredients(
                Stream.of(new Object[][] {
                        {GTValues.MV, DMEBlocks.TRANSPARENT_CASING.getItemVariant(DMETransparentCasing.CasingType.getByTier(GTValues.MV))},
                        {GTValues.EV, DMEBlocks.TRANSPARENT_CASING.getItemVariant(DMETransparentCasing.CasingType.getByTier(GTValues.EV))},
                        {GTValues.LuV, DMEBlocks.TRANSPARENT_CASING.getItemVariant(DMETransparentCasing.CasingType.getByTier(GTValues.LuV))}
                }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1]))
        );
    }

}
