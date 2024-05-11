package me.morishima.methoxymethane.api.unification.material.properties;

import static gregtech.api.unification.material.Materials.Seaborgium;
import static gregtech.api.unification.material.info.MaterialFlags.GENERATE_FINE_WIRE;


public class DMEMaterialFlagAdditions {

    public static void init() {
        Seaborgium.addFlags(GENERATE_FINE_WIRE);
    }


}
