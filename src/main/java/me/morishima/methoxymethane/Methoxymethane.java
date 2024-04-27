package me.morishima.methoxymethane;

import gregtech.GTInternalTags;
import gregtech.common.ConfigHolder;
import me.morishima.methoxymethane.api.utils.DMELog;
import me.morishima.methoxymethane.common.CommonProxy;
import me.morishima.methoxymethane.common.items.DMEMetaItems;
import me.morishima.methoxymethane.intergrations.gcy.GCYInternalTags;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.jetbrains.annotations.NotNull;

@Mod(
        modid = "methoxymethane",
        name = "Methoxymethane",
        version = "1.0",
        dependencies = GTInternalTags.DEP_VERSION_STRING + GCYInternalTags.DEP_VERSION_STRING
)
public class Methoxymethane {
    @SidedProxy(
            modId = "methoxymethane",
            clientSide = "me.morishima.methoxymethane.client.ClientProxy",
            serverSide = "me.morishima.methoxymethane.common.CommonProxy"
    )
    public static CommonProxy proxy;

    public Methoxymethane() {
    }

    @Mod.EventHandler
    public void onPreInit(@NotNull FMLPreInitializationEvent event) {
        DMELog.init(event.getModLog());
        DMEMetaItems.init();
        proxy.preInit();
    }

    @Mod.EventHandler
    public void onConstruction(@NotNull FMLConstructionEvent event) {
        ConfigHolder.machines.highTierContent = true;

    }
}
