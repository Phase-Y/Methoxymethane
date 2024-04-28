package me.morishima.methoxymethane.common.items;

import gregtech.api.items.metaitem.MetaItem;
import me.morishima.methoxymethane.common.items.items.DMEMetaItemCircuit;
import me.morishima.methoxymethane.common.items.items.DMEMetaItemComponent;

public class DMEMetaItems {

    public static void init()
    {
        DMEMetaItemCircuit circuit = new DMEMetaItemCircuit();
        DMEMetaItemComponent component = new DMEMetaItemComponent();
    }

    public static void initSubItems()
    {
        DMEMetaItemCircuit.registerItems();
        DMEMetaItemComponent.registerItems();
    }

    public static class Circuits {
        //General Circuits
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_ULV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_LV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_MV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_HV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_EV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_IV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_LuV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_ZPM;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_UV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_UHV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_UEV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_UIV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_UXV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_OpV;
        public static MetaItem<?>.MetaValueItem GENERAL_CIRCUIT_MAX;

        // Gooware
        public static MetaItem<?>.MetaValueItem GOOWARE_PROCESSOR;
        public static MetaItem<?>.MetaValueItem GOOWARE_ASSEMBLY;
        public static MetaItem<?>.MetaValueItem GOOWARE_COMPUTER;
        public static MetaItem<?>.MetaValueItem GOOWARE_MAINFRAME;

        // Optical
        public static MetaItem<?>.MetaValueItem OPTICAL_PROCESSOR;
        public static MetaItem<?>.MetaValueItem OPTICAL_ASSEMBLY;
        public static MetaItem<?>.MetaValueItem OPTICAL_COMPUTER;
        public static MetaItem<?>.MetaValueItem OPTICAL_MAINFRAME;

        // Spintronic
        public static MetaItem<?>.MetaValueItem SPINTRONIC_PROCESSOR;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_ASSEMBLY;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_COMPUTER;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_MAINFRAME;

        // Cosmic
        public static MetaItem<?>.MetaValueItem COSMIC_PROCESSOR;
        public static MetaItem<?>.MetaValueItem COSMIC_ASSEMBLY;
        public static MetaItem<?>.MetaValueItem COSMIC_COMPUTER;
        public static MetaItem<?>.MetaValueItem COSMIC_MAINFRAME;

        // Supra-causal
        public static MetaItem<?>.MetaValueItem SUPRACAUSAL_PROCESSOR;
        public static MetaItem<?>.MetaValueItem SUPRACAUSAL_ASSEMBLY;
        public static MetaItem<?>.MetaValueItem SUPRACAUSAL_COMPUTER;
        public static MetaItem<?>.MetaValueItem SUPRACAUSAL_MAINFRAME;

        // Supra-chronal
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_ULV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_LV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_MV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_HV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_EV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_IV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_LuV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_ZPM;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UHV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UEV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UIV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_UXV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_OpV;
        public static MetaItem<?>.MetaValueItem SUPRACHRONAL_MAX;

        // WRAP
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_ULV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_LV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_MV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_HV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_EV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_IV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_LuV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_ZPM;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UHV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UEV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UIV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UXV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_OpV;
        public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_MAX;

        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_ULV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_LV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_MV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_HV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_EV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_IV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_LuV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_ZPM;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_UV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_UHV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_UEV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_UIV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_UXV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_OpV;
        public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_CIRCUIT_MAX;

        public static MetaItem<?>.MetaValueItem QUANTUM_BIT_CIRCUIT_UV;
        public static MetaItem<?>.MetaValueItem QUANTUM_BIT_CIRCUIT_UHV;
        public static MetaItem<?>.MetaValueItem QUANTUM_BIT_CIRCUIT_UEV;
        public static MetaItem<?>.MetaValueItem QUANTUM_BIT_CIRCUIT_UIV;
        public static MetaItem<?>.MetaValueItem QUANTUM_BIT_CIRCUIT_UXV;
        public static MetaItem<?>.MetaValueItem QUANTUM_BIT_CIRCUIT_OpV;
        public static MetaItem<?>.MetaValueItem QUANTUM_BIT_CIRCUIT_MAX;

        // Primitive Circuit Components
        public static MetaItem<?>.MetaValueItem VACUUM_TUBE_COMPONENTS;
    }

    public static class Components {
        public static MetaItem<?>.MetaValueItem GOOWARE_BOARD;
        public static MetaItem<?>.MetaValueItem OPTICAL_BOARD;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_BOARD;
        public static MetaItem<?>.MetaValueItem MAGNETO_BOARD;
        public static MetaItem<?>.MetaValueItem GOOWARE_CIRCUIT_BOARD;
        public static MetaItem<?>.MetaValueItem OPTICAL_CIRCUIT_BOARD;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_CIRCUIT_BOARD;
        public static MetaItem<?>.MetaValueItem MAGNETO_CIRCUIT_BOARD;

        //Coil
        public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_UHV;
        public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_UEV;
        public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_UIV;
        public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_UXV;
        public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_OpV;
        public static MetaItem<?>.MetaValueItem VOLTAGE_COIL_MAX;

        //SMDs
        public static MetaItem<?>.MetaValueItem OPTICAL_CAPACITOR;
        public static MetaItem<?>.MetaValueItem OPTICAL_DIODE;
        public static MetaItem<?>.MetaValueItem OPTICAL_RESISTOR;
        public static MetaItem<?>.MetaValueItem OPTICAL_TRANSISTOR;
        public static MetaItem<?>.MetaValueItem OPTICAL_INDUCTOR;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_CAPACITOR;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_DIODE;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_RESISTOR;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_TRANSISTOR;
        public static MetaItem<?>.MetaValueItem SPINTRONIC_INDUCTOR;
        public static MetaItem<?>.MetaValueItem COSMIC_CAPACITOR;
        public static MetaItem<?>.MetaValueItem COSMIC_DIODE;
        public static MetaItem<?>.MetaValueItem COSMIC_RESISTOR;
        public static MetaItem<?>.MetaValueItem COSMIC_TRANSISTOR;
        public static MetaItem<?>.MetaValueItem COSMIC_INDUCTOR;
        public static MetaItem<?>.MetaValueItem SUPRACAUSAL_CAPACITOR;
        public static MetaItem<?>.MetaValueItem SUPRACAUSAL_DIODE;
        public static MetaItem<?>.MetaValueItem SUPRACAUSAL_RESISTOR;
        public static MetaItem<?>.MetaValueItem SUPRACAUSAL_TRANSISTOR;
        public static MetaItem<?>.MetaValueItem SUPRACAUSAL_INDUCTOR;
    }

}
