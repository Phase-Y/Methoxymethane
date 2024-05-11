package me.morishima.methoxymethane.loaders.recipes;

import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;
import me.morishima.methoxymethane.common.blocks.DMEBlocks;
import me.morishima.methoxymethane.common.blocks.metablock.DMEBlockMultiblock;
import me.morishima.methoxymethane.common.metatileentities.DMEMetaTileEntities;

public class DMEMachineRecipes {

    public static void init() {
        ModHandler.addShapedRecipe(true, "primitive_alloy_furnace_dme",
                DMEMetaTileEntities.PRIMITIVE_ALLOY_FURNACE.getStackForm(), "hRS", "PBR", "dRS", 'R',
                new UnificationEntry(OrePrefix.stick, Materials.WroughtIron), 'S',
                new UnificationEntry(OrePrefix.screw, Materials.WroughtIron), 'P',
                new UnificationEntry(OrePrefix.plate, Materials.WroughtIron), 'B',
                DMEBlocks.MULTIBLOCK_BLOCKS.getItemVariant(DMEBlockMultiblock.BlockType.INSULATING_SILICON_BRICKS));

        ModHandler.addShapedRecipe(true, "platter_dme",
                DMEMetaTileEntities.ELECTRIC_FOIL_PLATING_FACTORY.getStackForm(), "CAC", "THG", "CEC",
                'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.EV),
                'A', new UnificationEntry(OrePrefix.plate, Materials.Rubber),
                'T', MetaItems.CONVEYOR_MODULE_EV,
                'H', MetaTileEntities.HULL[GTValues.EV].getStackForm(),
                'G', MetaItems.ROBOT_ARM_EV,
                'E', MetaItems.EMITTER_EV
        );
    }

}
