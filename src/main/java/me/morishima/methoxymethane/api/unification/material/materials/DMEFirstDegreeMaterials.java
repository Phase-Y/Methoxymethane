package me.morishima.methoxymethane.api.unification.material.materials;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.PropertyKey;

import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static me.morishima.methoxymethane.api.unification.material.DMEMaterials.*;

public class DMEFirstDegreeMaterials {

    private static int startId = 21000;
    private static final int endId = startId + 1000;

    public static void register() {
        MercuryCadmiumTelluride = new Material.Builder(getId(), gregtechId("mercury_cadmium_telluride"))
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

        ChromiumGermaniumTelluride = new Material.Builder(getId(), gregtechId("chromium_germanium_telluride"))
                .ingot()
                .fluid()
                .color(0x8F103E)
                .iconSet(METALLIC)
                .flags(GENERATE_ROD, GENERATE_LONG_ROD)
                .components(Chrome, 1, Germanium, 1, Tellurium, 3)
                .blast(b -> b
                        .temp(2900, BlastProperty.GasTier.HIGHER))
                .build();



        ChromiumGermaniumTellurideMagnetic = new Material.Builder(getId(), gregtechId("chromium_germanium_telluride_magnetic"))
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

    }

    private static int getId() {
        if (startId < endId) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

}
