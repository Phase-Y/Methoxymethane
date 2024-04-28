package me.morishima.methoxymethane.client;

import me.morishima.methoxymethane.common.CommonProxy;
import me.morishima.methoxymethane.common.blocks.DMEMetaBlocks;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber({Side.CLIENT})
public class ClientProxy extends CommonProxy {
    public ClientProxy() {
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        DMEMetaBlocks.registerItemModels();
    }

    public void preInit() {
        super.preInit();
    }
}
