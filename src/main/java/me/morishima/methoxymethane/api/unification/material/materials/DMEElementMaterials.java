package me.morishima.methoxymethane.api.unification.material.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.ToolProperty;
import me.morishima.methoxymethane.api.unification.material.DMEElements;

import static gregtech.api.GTValues.MAX;
import static gregtech.api.GTValues.V;
import static gregtech.api.unification.material.Materials.EXT2_METAL;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static me.morishima.methoxymethane.api.unification.material.DMEMaterials.Infinitium;

public class DMEElementMaterials {

    private static int startId = 10000;
    private static final int endId = startId + 1000;

    public static void register() {
        Infinitium = new Material.Builder(getId(), gregtechId("infinitium"))
                .color(0xFFFFFF).ingot().fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(99999999))
                .element(DMEElements.INF)
                .iconSet(MaterialIconSet.SHINY)
                .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_FRAME, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE)
                .toolStats(ToolProperty.Builder.of(6000F, 7500F, Integer.MAX_VALUE, 999)
                        .enchantability(999).build())
                .rotorStats(10000f, 20000f, Integer.MAX_VALUE)
                .cableProperties(V[MAX], 1, 1)
                .fluidPipeProperties(Integer.MAX_VALUE, Integer.MAX_VALUE, true)
                .build();
    }

    private static int getId() {
        if (startId < endId) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }


}
