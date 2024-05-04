package me.morishima.methoxymethane.common.blocks.metablock;

import gregtech.api.block.VariantBlock;
import me.morishima.methoxymethane.common.CommonProxy;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nonnull;

public class DMEBlockMultiblock extends VariantBlock<DMEBlockMultiblock.BlockType> {

    public DMEBlockMultiblock() {
        super(Material.IRON);
        setTranslationKey("multiblock_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe", 1);
        setDefaultState(getState(BlockType.INSULATING_SILICON_BRICKS));
        setCreativeTab(CommonProxy.TAB_DME);
    }

    public enum BlockType implements IStringSerializable {
        INSULATING_SILICON_BRICKS("insulating_silicon_bricks");
        private final String name;
        BlockType(String name) {
            this.name = name;
        }

        @Nonnull
        @Override
        public String getName() {
            return name;
        }
    }

}
