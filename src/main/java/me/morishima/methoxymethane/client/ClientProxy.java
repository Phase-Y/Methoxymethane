package me.morishima.methoxymethane.client;

import me.morishima.methoxymethane.common.CommonProxy;
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
    }

    public void preInit() {
        super.preInit();
    }
}
