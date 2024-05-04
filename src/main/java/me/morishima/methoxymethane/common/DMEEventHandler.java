package me.morishima.methoxymethane.common;

import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.event.PostMaterialEvent;
import me.morishima.methoxymethane.api.unification.material.DMEMaterials;
import me.morishima.methoxymethane.common.blocks.DMEBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.ApiStatus;

import java.util.Objects;

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

    @SubscribeEvent
    public static void onOreGen(OreGenEvent.Pre event) {
        if (Objects.requireNonNull(event.getWorld().getBlockState(event.getPos()).getBlock().getRegistryName()).getPath().contains("oil")) {

            for (int i = 4; i > 0 ; i--) {
                BlockPos pos2 = new BlockPos(event.getPos().getX(), i, event.getPos().getZ());
                if (event.getWorld().getBlockState(pos2).getBlock() == Blocks.BEDROCK) {
                    if (event.getRand().nextInt(100) < 40) event.getWorld().setBlockState(pos2, DMEBlocks.NATURAL_GAS_SPRING.getDefaultState());
                }
            }
        }
    }
}
