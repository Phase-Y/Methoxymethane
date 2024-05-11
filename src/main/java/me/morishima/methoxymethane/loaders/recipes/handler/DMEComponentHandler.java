package me.morishima.methoxymethane.loaders.recipes.handler;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.stack.UnificationEntry;
import me.morishima.methoxymethane.common.items.DMEMetaItems;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UHV;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UV;
import static me.morishima.methoxymethane.api.unification.material.DMEMaterials.*;

public class DMEComponentHandler {


    public static void registerMotor() {
        //  ULV
        ModHandler.addShapedRecipe(true, "electric_motor.ulv", DMEMetaItems.Components.ELECTRIC_MOTOR_ULV.getStackForm(),
                "CWR", "WMW", "RWC",
                'C', new UnificationEntry(pipeTinyFluid, Bronze),
                'W', new UnificationEntry(wireGtSingle, Lead),
                'M', new UnificationEntry(stick, IronMagnetic),
                'R', new UnificationEntry(stick, WroughtIron));

        //  UHV
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, ChromiumGermaniumTellurideMagnetic)
                .input(stickLong, ResistantExtremeEnvironmentalAlloy, 4)
                .input(ring, ResistantExtremeEnvironmentalAlloy, 4)
                .input(round, ResistantExtremeEnvironmentalAlloy, 8)
                .input(wireFine, TungstensteelPlatedOsmiridium, 64)
                .input(wireFine, TungstensteelPlatedOsmiridium, 64)
                .input(cableGtSingle, Europium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L * 8))
                .fluidInputs(Lubricant.getFluid(3000))
                .fluidInputs(Vibranium.getFluid(L))
                .output(ELECTRIC_MOTOR_UHV)
                .duration(1200)
                .EUt(400000)
                .stationResearch(b -> b
                        .researchStack(ELECTRIC_MOTOR_UV.getStackForm())
                        .CWUt(64)
                        .EUt(VA[UV]))
                .buildAndRegister();



    }
}
