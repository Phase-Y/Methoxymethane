package me.morishima.methoxymethane.common;

import gregtech.api.util.BaseCreativeTab;
import gregtech.common.items.MetaItems;
import me.morishima.methoxymethane.api.utils.DMELog;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Objects;
import java.util.function.Function;

@Mod.EventBusSubscriber(
        modid = "methoxymethane"
)
public class CommonProxy {
    public static final BaseCreativeTab TAB_DME = new BaseCreativeTab(
            "methoxymethane",
            () -> MetaItems.ELECTRIC_MOTOR_UXV.getStackForm(),
            false
    );
    public static final BaseCreativeTab TAB_CIRCUIT = new BaseCreativeTab(
            "methoxymethane_circuit",
            () -> MetaItems.WETWARE_SUPER_COMPUTER_UV.getStackForm(),
            false
    );

    public CommonProxy() {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        DMELog.logger.info("Registering blocks...");
        IForgeRegistry<Block> registry = event.getRegistry();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        DMELog.logger.info("Registering Items...");
        IForgeRegistry<Item> registry = event.getRegistry();
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        DMELog.logger.info("Registering recipes...");
    }

    public void preInit() {
    }
}
