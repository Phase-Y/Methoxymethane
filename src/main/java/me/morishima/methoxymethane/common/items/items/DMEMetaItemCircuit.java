package me.morishima.methoxymethane.common.items.items;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.ore.OrePrefix;
import me.morishima.methoxymethane.api.item.DMEStandardMetaItem;
import me.morishima.methoxymethane.common.CommonProxy;

import static me.morishima.methoxymethane.api.utils.DMEUtils.toTierMaterial;
import static me.morishima.methoxymethane.api.utils.DMEUtils.toTierName;
import static me.morishima.methoxymethane.common.items.DMEMetaItems.Circuits.*;

public class DMEMetaItemCircuit extends DMEStandardMetaItem {

    public DMEMetaItemCircuit() {
        setRegistryName("circuit");
        setCreativeTab(CommonProxy.TAB_CIRCUIT);
    }

    public void registerSubItems() {
        GENERAL_CIRCUIT_ULV = this.addCircuit(0, "general", 0);
        GENERAL_CIRCUIT_LV = this.addCircuit(1, "general", 1);
        GENERAL_CIRCUIT_MV = this.addCircuit(2, "general", 2);
        GENERAL_CIRCUIT_HV = this.addCircuit(3, "general", 3);
        GENERAL_CIRCUIT_EV = this.addCircuit(4, "general", 4);
        GENERAL_CIRCUIT_IV = this.addCircuit(5, "general", 5);
        GENERAL_CIRCUIT_LuV = this.addCircuit(6, "general", 6);
        GENERAL_CIRCUIT_ZPM = this.addCircuit(7, "general", 7);
        GENERAL_CIRCUIT_UV = this.addCircuit(8, "general", 8);
        GENERAL_CIRCUIT_UHV = this.addCircuit(9, "general", 9);
        GENERAL_CIRCUIT_UEV = this.addCircuit(10, "general", 10);
        GENERAL_CIRCUIT_UIV = this.addCircuit(11, "general", 11);
        GENERAL_CIRCUIT_UXV = this.addCircuit(12, "general", 12);
        GENERAL_CIRCUIT_OpV = this.addCircuit(13, "general", 13);
        GENERAL_CIRCUIT_MAX = this.addCircuit(14, "general", 14);

        GOOWARE_PROCESSOR = this.addCircuit(20, "gooware", 7);
        GOOWARE_ASSEMBLY = this.addCircuit(21, "gooware", 8);
        GOOWARE_COMPUTER = this.addCircuit(22, "gooware", 9);
        GOOWARE_MAINFRAME = this.addCircuit(23, "gooware", 10);

        OPTICAL_PROCESSOR = this.addCircuit(30, "optical", 8);
        OPTICAL_ASSEMBLY = this.addCircuit(31, "optical", 9);
        OPTICAL_COMPUTER = this.addCircuit(32, "optical", 10);
        OPTICAL_MAINFRAME = this.addCircuit(33, "optical", 11);

        SPINTRONIC_PROCESSOR = this.addCircuit(40, "spintronic", 9);
        SPINTRONIC_ASSEMBLY = this.addCircuit(41, "spintronic", 10);
        SPINTRONIC_COMPUTER = this.addCircuit(42, "spintronic", 11);
        SPINTRONIC_MAINFRAME = this.addCircuit(43, "spintronic", 12);

        COSMIC_PROCESSOR = this.addCircuit(50, "cosmic", 10);
        COSMIC_ASSEMBLY = this.addCircuit(51, "cosmic", 11);
        COSMIC_COMPUTER = this.addCircuit(52, "cosmic", 12);
        COSMIC_MAINFRAME = this.addCircuit(53, "cosmic", 13);

        SUPRACAUSAL_PROCESSOR = this.addCircuit(60, "supracausal", 11);
        SUPRACAUSAL_ASSEMBLY = this.addCircuit(61, "supracausal", 12);
        SUPRACAUSAL_COMPUTER = this.addCircuit(62, "supracausal", 13);
        SUPRACAUSAL_MAINFRAME = this.addCircuit(63, "supracausal", 14);

        SUPRACHRONAL_ULV = this.addCircuit(70, "suprachronal", 0);
        SUPRACHRONAL_LV = this.addCircuit(71, "suprachronal", 1);
        SUPRACHRONAL_MV = this.addCircuit(72, "suprachronal", 2);
        SUPRACHRONAL_HV = this.addCircuit(73, "suprachronal", 3);
        SUPRACHRONAL_EV = this.addCircuit(74, "suprachronal", 4);
        SUPRACHRONAL_IV = this.addCircuit(75, "suprachronal", 5);
        SUPRACHRONAL_LuV = this.addCircuit(76, "suprachronal", 6);
        SUPRACHRONAL_ZPM = this.addCircuit(77, "suprachronal", 7);
        SUPRACHRONAL_UV = this.addCircuit(78, "suprachronal", 8);
        SUPRACHRONAL_UHV = this.addCircuit(79, "suprachronal", 9);
        SUPRACHRONAL_UEV = this.addCircuit(80, "suprachronal", 10);
        SUPRACHRONAL_UIV = this.addCircuit(81, "suprachronal", 11);
        SUPRACHRONAL_UXV = this.addCircuit(82, "suprachronal", 12);
        SUPRACHRONAL_OpV = this.addCircuit(83, "suprachronal", 13);
        SUPRACHRONAL_MAX = this.addCircuit(84, "suprachronal", 14);

        WRAP_CIRCUIT_ULV = this.addItem(90, "circuit.wrap.ulv");
        WRAP_CIRCUIT_LV = this.addItem(91, "circuit.wrap.lv");
        WRAP_CIRCUIT_MV = this.addItem(92, "circuit.wrap.mv");
        WRAP_CIRCUIT_HV = this.addItem(93, "circuit.wrap.hv");
        WRAP_CIRCUIT_EV = this.addItem(94, "circuit.wrap.ev");
        WRAP_CIRCUIT_IV = this.addItem(95, "circuit.wrap.iv");
        WRAP_CIRCUIT_LuV = this.addItem(96, "circuit.wrap.luv");
        WRAP_CIRCUIT_ZPM = this.addItem(97, "circuit.wrap.zpm");
        WRAP_CIRCUIT_UV = this.addItem(98, "circuit.wrap.uv");
        WRAP_CIRCUIT_UHV = this.addItem(99, "circuit.wrap.uhv");
        WRAP_CIRCUIT_UEV = this.addItem(100, "circuit.wrap.uev");
        WRAP_CIRCUIT_UIV = this.addItem(101, "circuit.wrap.uiv");
        WRAP_CIRCUIT_UXV = this.addItem(102, "circuit.wrap.uxv");
        WRAP_CIRCUIT_OpV = this.addItem(103, "circuit.wrap.opv");
        WRAP_CIRCUIT_MAX = this.addItem(104, "circuit.wrap.max");

        MAGNETO_RESONATIC_CIRCUIT_ULV = this.addCircuit(110, "magneto", 0);
        MAGNETO_RESONATIC_CIRCUIT_LV = this.addCircuit(111, "magneto", 1);
        MAGNETO_RESONATIC_CIRCUIT_MV = this.addCircuit(112, "magneto", 2);
        MAGNETO_RESONATIC_CIRCUIT_HV = this.addCircuit(113, "magneto", 3);
        MAGNETO_RESONATIC_CIRCUIT_EV = this.addCircuit(114, "magneto", 4);
        MAGNETO_RESONATIC_CIRCUIT_IV = this.addCircuit(115, "magneto", 5);
        MAGNETO_RESONATIC_CIRCUIT_LuV = this.addCircuit(116, "magneto", 6);
        MAGNETO_RESONATIC_CIRCUIT_ZPM = this.addCircuit(117, "magneto", 7);
        MAGNETO_RESONATIC_CIRCUIT_UV = this.addCircuit(118, "magneto", 8);
        MAGNETO_RESONATIC_CIRCUIT_UHV = this.addCircuit(119, "magneto", 9);
        MAGNETO_RESONATIC_CIRCUIT_UEV = this.addCircuit(120, "magneto", 10);
        MAGNETO_RESONATIC_CIRCUIT_UIV = this.addCircuit(121, "magneto", 11);
        MAGNETO_RESONATIC_CIRCUIT_UXV = this.addCircuit(122, "magneto", 12);
        MAGNETO_RESONATIC_CIRCUIT_OpV = this.addCircuit(123, "magneto", 13);
        MAGNETO_RESONATIC_CIRCUIT_MAX = this.addCircuit(124, "magneto", 14);

        QUANTUM_BIT_CIRCUIT_UV = this.addCircuit(130, "quantum_bit", 8);
        QUANTUM_BIT_CIRCUIT_UHV = this.addCircuit(131, "quantum_bit", 9);
        QUANTUM_BIT_CIRCUIT_UEV = this.addCircuit(132, "quantum_bit", 10);
        QUANTUM_BIT_CIRCUIT_UIV = this.addCircuit(133, "quantum_bit", 11);
        QUANTUM_BIT_CIRCUIT_UXV = this.addCircuit(134, "quantum_bit", 12);
        QUANTUM_BIT_CIRCUIT_OpV = this.addCircuit(135, "quantum_bit", 13);
        QUANTUM_BIT_CIRCUIT_MAX = this.addCircuit(136, "quantum_bit", 14);

        VACUUM_TUBE_COMPONENTS = this.addItem(140, "vacuum_tube.components");
    }

    private MetaItem<?>.MetaValueItem addCircuit(int metaValue, String type, int level) {
        String unlocalizedName = String.format("circuit.%s.%s", type, toTierName(level).toLowerCase());
        names.add(unlocalizedName);
        return this.addItem(metaValue, unlocalizedName).setUnificationData(OrePrefix.circuit, toTierMaterial(level));
    }



}
