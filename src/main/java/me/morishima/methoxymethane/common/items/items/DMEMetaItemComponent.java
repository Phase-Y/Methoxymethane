package me.morishima.methoxymethane.common.items.items;

import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;
import me.morishima.methoxymethane.api.item.DMEStandardMetaItem;
import me.morishima.methoxymethane.api.unification.material.DMEMaterials;
import me.morishima.methoxymethane.common.CommonProxy;

import static gregtech.api.GTValues.M;
import static me.morishima.methoxymethane.common.items.DMEMetaItems.Components.*;

public class DMEMetaItemComponent extends DMEStandardMetaItem {

    public DMEMetaItemComponent() {
        setRegistryName("component");
        setCreativeTab(CommonProxy.TAB_COMPONENT);
    }

    public void registerSubItems() {
        //Board
        GOOWARE_BOARD = this.addItem(0, "board.gooware");
        OPTICAL_BOARD = this.addItem(1, "board.optical");
        SPINTRONIC_BOARD = this.addItem(2, "board.spintronic");
        MAGNETO_BOARD = this.addItem(3, "board.magneto_resonatic");
        GOOWARE_CIRCUIT_BOARD = this.addItem(4, "circuit_board.gooware");
        OPTICAL_CIRCUIT_BOARD = this.addItem(5, "circuit_board.optical");
        SPINTRONIC_CIRCUIT_BOARD = this.addItem(6, "circuit_board.spintronic");
        MAGNETO_CIRCUIT_BOARD = this.addItem(7, "circuit_board.magneto_resonatic");

        VOLTAGE_COIL_UHV = this.addItem(10, "voltage_coil.uhv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(DMEMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(DMEMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_UEV = this.addItem(11, "voltage_coil.uev").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(DMEMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(DMEMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_UIV = this.addItem(12, "voltage_coil.uiv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(DMEMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(DMEMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_UXV = this.addItem(13, "voltage_coil.uxv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(DMEMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(DMEMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_OpV = this.addItem(14, "voltage_coil.opv").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(DMEMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(DMEMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));
        VOLTAGE_COIL_MAX = this.addItem(15, "voltage_coil.max").setMaterialInfo(new ItemMaterialInfo(new MaterialStack(DMEMaterials.MercuryCadmiumTelluride, M * 2), new MaterialStack(DMEMaterials.ChromiumGermaniumTellurideMagnetic, M / 2)));

        OPTICAL_CAPACITOR = this.addItem(90, "component.optical_smd.capacitor");
        OPTICAL_DIODE = this.addItem(91, "component.optical_smd.diode");
        OPTICAL_RESISTOR = this.addItem(92, "component.optical_smd.resistor");
        OPTICAL_TRANSISTOR = this.addItem(93, "component.optical_smd.transistor");
        OPTICAL_INDUCTOR = this.addItem(94, "component.optical_smd.inductor");

        SPINTRONIC_CAPACITOR = this.addItem(95, "component.spintronic_smd.capacitor");
        SPINTRONIC_DIODE = this.addItem(96, "component.spintronic_smd.diode");
        SPINTRONIC_RESISTOR = this.addItem(97, "component.spintronic_smd.resistor");
        SPINTRONIC_TRANSISTOR = this.addItem(98, "component.spintronic_smd.transistor");
        SPINTRONIC_INDUCTOR = this.addItem(99, "component.spintronic_smd.inductor");

        COSMIC_CAPACITOR = this.addItem(100, "component.cosmic_smd.capacitor");
        COSMIC_DIODE = this.addItem(101, "component.cosmic_smd.diode");
        COSMIC_RESISTOR = this.addItem(102, "component.cosmic_smd.resistor");
        COSMIC_TRANSISTOR = this.addItem(103, "component.cosmic_smd.transistor");
        COSMIC_INDUCTOR = this.addItem(104, "component.cosmic_smd.inductor");

        SUPRACAUSAL_CAPACITOR = this.addItem(105, "component.supracausal_smd.capacitor");
        SUPRACAUSAL_DIODE = this.addItem(106, "component.supracausal_smd.diode");
        SUPRACAUSAL_RESISTOR = this.addItem(107, "component.supracausal_smd.resistor");
        SUPRACAUSAL_TRANSISTOR = this.addItem(108, "component.supracausal_smd.transistor");
        SUPRACAUSAL_INDUCTOR = this.addItem(109, "component.supracausal_smd.inductor");
    }

}
