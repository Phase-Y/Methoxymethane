package me.morishima.methoxymethane.common;

import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.event.PostMaterialEvent;
import me.morishima.methoxymethane.api.unification.material.DMEMaterials;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.ApiStatus;

@Mod.EventBusSubscriber(
        modid = "methoxymethane"
)
@ApiStatus.Internal
public final class DMEEventHandler {
    private DMEEventHandler() {
    }

    @SubscribeEvent(
            priority = EventPriority.HIGH
    )
    public static void registerMaterials(MaterialEvent event) {
        DMEMaterials.init();
    }

    @SubscribeEvent
    public static void registerMaterialsPost(PostMaterialEvent event) {
    }
}
