package me.morishima.methoxymethane.api.unification.material.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.stack.MaterialStack;

import static gregtech.api.unification.material.Materials.*;
import static me.morishima.methoxymethane.api.unification.material.DMEMaterials.*;
import static me.morishima.methoxymethane.api.utils.DMEUtils.dmeId;

public class DMEChemicalMaterials {

    private static int startId = 27000;
    private static final int endId = startId + 3000;

    public static void register() {
        EthylAcetate = new Material.Builder(getId(), dmeId("ethyl_acetate"))
                .color(0xFFFFFF)
                .fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
                .components(new MaterialStack(Carbon, 4), new MaterialStack(Hydrogen, 8), new MaterialStack(Oxygen, 2))
                .build().setFormula("CH3COOCH2CH3", true);

        DimethylPhosphate = new Material.Builder(getId(), dmeId("dimethyl_phosphate"))
                .components(new MaterialStack(Carbon, 2), new MaterialStack(Hydrogen, 7), new MaterialStack(Oxygen, 4), new MaterialStack(Phosphorus, 1))
                .color(0xCC9933).fluid(FluidStorageKeys.LIQUID, new FluidBuilder())
                .build().setFormula("(CH3O)2PO2H", true);

        PhenolicResin = new Material.Builder(getId(), dmeId("phenolic_resin"))
                .polymer().color(0xBB6C20).fluid()
                .build();
    }

    private static int getId() {
        if (startId < endId) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
