package me.morishima.methoxymethane.common.blocks;

import gregtech.common.blocks.MetaBlocks;
import me.morishima.methoxymethane.common.blocks.block.BlockNaturalGasSpring;
import me.morishima.methoxymethane.common.blocks.metablock.DMEBlockMultiblock;
import me.morishima.methoxymethane.common.blocks.metablock.DMETransparentCasing;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DMEBlocks {

    public static DMEBlockMultiblock MULTIBLOCK_BLOCKS;
    public static DMETransparentCasing TRANSPARENT_CASING;
    public static BlockNaturalGasSpring NATURAL_GAS_SPRING;

    private DMEBlocks() {}

    public static void init() {
        MULTIBLOCK_BLOCKS = new DMEBlockMultiblock();
        MULTIBLOCK_BLOCKS.setRegistryName("multiblock_casing");
        TRANSPARENT_CASING = new DMETransparentCasing();
        TRANSPARENT_CASING.setRegistryName("transparent_casing");
        NATURAL_GAS_SPRING = new BlockNaturalGasSpring();
        NATURAL_GAS_SPRING.setRegistryName("natural_gas_spring");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(MULTIBLOCK_BLOCKS);
        registerItemModel(TRANSPARENT_CASING);
        registerItemModel(NATURAL_GAS_SPRING);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(Block block) {

        for (IBlockState state : block.getBlockState().getValidStates()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                            MetaBlocks.statePropertiesToString(state.getProperties())));
        }

    }

}
