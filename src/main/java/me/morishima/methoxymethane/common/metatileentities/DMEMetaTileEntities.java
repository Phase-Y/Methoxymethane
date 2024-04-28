package me.morishima.methoxymethane.common.metatileentities;

import me.morishima.methoxymethane.api.utils.DMELog;
import me.morishima.methoxymethane.common.metatileentities.multi.primitive.MetaTileEntityPrimitiveAlloyFurnace;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static me.morishima.methoxymethane.api.utils.DMEUtils.dmeId;

public class DMEMetaTileEntities {

    public static MetaTileEntityPrimitiveAlloyFurnace PRIMITIVE_ALLOY_FURNACE;

    public static void init() {
        DMELog.logger.info("Registering MetaTileEntities");
        PRIMITIVE_ALLOY_FURNACE = registerMetaTileEntity(25001, new MetaTileEntityPrimitiveAlloyFurnace(dmeId("primitive_alloy_furnace")));
    }

}
