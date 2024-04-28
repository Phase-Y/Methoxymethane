package me.morishima.methoxymethane.common.blocks;

import gregtech.common.blocks.MetaBlocks;
import me.morishima.methoxymethane.common.blocks.block.DMEBlockMultiblock;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DMEMetaBlocks {

    public static DMEBlockMultiblock MULTIBLOCK_BLOCKS;

    private DMEMetaBlocks() {}

    public static void init() {
        MULTIBLOCK_BLOCKS = new DMEBlockMultiblock();
        MULTIBLOCK_BLOCKS.setRegistryName("multiblock_casing");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(MULTIBLOCK_BLOCKS);
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
