package me.morishima.methoxymethane.api.unification.material;

import gregtech.api.unification.material.Material;
import me.morishima.methoxymethane.api.unification.material.materials.DMEChemicalMaterials;
import me.morishima.methoxymethane.api.unification.material.materials.DMEElementMaterials;
import me.morishima.methoxymethane.api.unification.material.materials.DMEFirstDegreeMaterials;


public class DMEMaterials {

    /**
     * ID Range: 20000 - 30000
     */

    //Element: 20000 - 21000


    //First Degree: 21000 - 22000
    public static Material MercuryCadmiumTelluride;
    public static Material ChromiumGermaniumTelluride;
    public static Material ChromiumGermaniumTellurideMagnetic;
    public static Material ImpuritiesNaturalGas;

    //Chemical: 27000 - 30000
    public static Material EthylAcetate;
    public static Material DimethylPhosphate;
    public static Material PhenolicResin;

    public static void init() {
        DMEElementMaterials.register();
        DMEFirstDegreeMaterials.register();
        DMEChemicalMaterials.register();
    }

}
