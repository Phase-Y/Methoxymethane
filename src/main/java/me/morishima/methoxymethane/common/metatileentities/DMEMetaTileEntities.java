package me.morishima.methoxymethane.common.metatileentities;

import me.morishima.methoxymethane.api.utils.DMELog;
import me.morishima.methoxymethane.common.metatileentities.multi.electric.MetaTileEntityElectricFoilPlatingFactory;
import me.morishima.methoxymethane.common.metatileentities.multi.primitive.MetaTileEntityPrimitiveAlloyFurnace;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static me.morishima.methoxymethane.api.utils.DMEUtils.dmeId;

public class DMEMetaTileEntities {

    //Single: 21000 - 24999

    //Multiblock: 25000 - 26999
    public static MetaTileEntityPrimitiveAlloyFurnace PRIMITIVE_ALLOY_FURNACE;
    public static MetaTileEntityElectricFoilPlatingFactory ELECTRIC_FOIL_PLATING_FACTORY;

    //Misc: 27000 - 28000

    public static void init() {
        DMELog.logger.info("Registering MetaTileEntities");

        //Multiblocks
        PRIMITIVE_ALLOY_FURNACE = registerMetaTileEntity(25000, new MetaTileEntityPrimitiveAlloyFurnace(dmeId("primitive_alloy_furnace")));
        ELECTRIC_FOIL_PLATING_FACTORY = registerMetaTileEntity(25001, new MetaTileEntityElectricFoilPlatingFactory(dmeId("electric_foil_plating_factory")));
    }

}
