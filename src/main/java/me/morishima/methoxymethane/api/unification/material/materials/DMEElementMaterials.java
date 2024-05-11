package me.morishima.methoxymethane.api.unification.material.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.ToolProperty;
import me.morishima.methoxymethane.api.unification.material.DMEElements;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.EXT2_METAL;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.SHINY;
import static me.morishima.methoxymethane.api.unification.material.DMEMaterials.*;
import static me.morishima.methoxymethane.api.utils.DMEUtils.dmeId;

public class DMEElementMaterials {

    private static int startId = 10000;
    private static final int endId = startId + 1000;

    public static void register() {
        Infinitium = new Material.Builder(getId(), dmeId("infinitium"))
                .color(0xFFFFFF).ingot().fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(99999999))
                .element(DMEElements.INF)
                .iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_FRAME, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .toolStats(ToolProperty.Builder.of(6000F, 7500F, Integer.MAX_VALUE, 999)
                        .enchantability(999).build())
                .rotorStats(10000f, 20000f, Integer.MAX_VALUE)
                .cableProperties(V[MAX], 1, 1)
                .fluidPipeProperties(Integer.MAX_VALUE, Integer.MAX_VALUE, true)
                .build();

        Vibranium = new Material.Builder(getId(), dmeId("vibranium"))
                .ingot()
                .fluid()
                .plasma()
                .color(0xC880FF)
                .iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE, GENERATE_DENSE)
                .element(DMEElements.Vb)
                .blast(4852, BlastProperty.GasTier.HIGH)
                .rotorStats(30.0F, 15.0F, 640000)
                .build();

        CosmicNeutronium = new Material.Builder(getId(), dmeId("cosmic_neutronium"))
                .ingot()
                .liquid(new FluidBuilder().temperature(2000000))
                .color(0x000000)
                .iconSet(SHINY)
                .blast(b -> b
                        .temp(15000, BlastProperty.GasTier.HIGHEST)
                        .blastStats(VA[UXV], 200)
                        .blastStats(VA[UXV], 200))
                .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_RING, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_LONG_ROD, GENERATE_ROUND,
                        NO_SMELTING)
                .element(DMEElements.SpNt)
                .build();
    }

    private static int getId() {
        if (startId < endId) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }


}
