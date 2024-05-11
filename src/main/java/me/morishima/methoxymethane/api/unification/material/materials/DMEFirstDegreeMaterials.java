package me.morishima.methoxymethane.api.unification.material.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.fluids.store.FluidStorageKeys;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.stack.MaterialStack;

import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static me.morishima.methoxymethane.api.unification.material.DMEMaterials.*;
import static me.morishima.methoxymethane.api.utils.DMEUtils.dmeId;

public class DMEFirstDegreeMaterials {

    private static int startId = 21000;
    private static final int endId = startId + 1000;

    public static void register() {
        MercuryCadmiumTelluride = new Material.Builder(getId(), dmeId("mercury_cadmium_telluride"))
                .ingot()
                .fluid()
                .color(0x823C80)
                .iconSet(BRIGHT)
                .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .components(Mercury, 2, Cadmium, 1, Tellurium, 2)
                .blast(b -> b
                        .temp(2170, BlastProperty.GasTier.HIGHER)
                        .blastStats(VA[UHV]))
                .build();

        ChromiumGermaniumTelluride = new Material.Builder(getId(), dmeId("chromium_germanium_telluride"))
                .ingot()
                .fluid()
                .color(0x8F103E)
                .iconSet(METALLIC)
                .flags(GENERATE_ROD, GENERATE_LONG_ROD)
                .components(Chrome, 1, Germanium, 1, Tellurium, 3)
                .blast(b -> b
                        .temp(2900, BlastProperty.GasTier.HIGHER))
                .build();



        ChromiumGermaniumTellurideMagnetic = new Material.Builder(getId(), dmeId("chromium_germanium_telluride_magnetic"))
                .ingot()
                .color(0x8F103E)
                .iconSet(MAGNETIC)
                .flags(GENERATE_ROD, GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(ChromiumGermaniumTelluride, 1)
                .ingotSmeltInto(ChromiumGermaniumTelluride)
                .arcSmeltInto(ChromiumGermaniumTelluride)
                .macerateInto(ChromiumGermaniumTelluride)
                .build();

        ChromiumGermaniumTelluride.getProperty(PropertyKey.INGOT).setMagneticMaterial(ChromiumGermaniumTellurideMagnetic);

        ImpuritiesNaturalGas = new Material.Builder(getId(), dmeId("impurities_natural_gas"))
                .fluid(FluidStorageKeys.GAS, new FluidBuilder().density(10))
                .color(0xF0F8FF).flags(NO_UNIFICATION)
                .build();

        TungstensteelPlatedOsmiridium = new Material.Builder(getId(), dmeId("tungsten_steel_plated_osmiridium"))
                .color(0x483D8B).ingot().fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(3985))
                .iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_FRAME, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE, DISABLE_DECOMPOSITION)
                .components(new MaterialStack(Osmiridium, 1), new MaterialStack(TungstenSteel, 1))
                .build().setFormula("(Ir3Os)(*W)", true);

        PlatingLiquid = new Material.Builder(getId(), dmeId("plating_liquid"))
                .color(0xD2D2BE).liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
                .build();

        ResistantExtremeEnvironmentalAlloy = new Material.Builder(getId(), dmeId("resistant_extreme_environmental_alloy"))
                .color(0x23232B).ingot().fluid(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(5472))
                .blast(6000)
                .iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_RING, GENERATE_FINE_WIRE, GENERATE_DOUBLE_PLATE, GENERATE_ROUND)
                .build().setFormula("Ni10AlCr3(FeW)2Co8Mo4Nb2C3", true);
    }

    private static int getId() {
        if (startId < endId) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

}
