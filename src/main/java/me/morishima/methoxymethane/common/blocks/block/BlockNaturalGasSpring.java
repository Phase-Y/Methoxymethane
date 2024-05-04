package me.morishima.methoxymethane.common.blocks.block;

import gregtech.api.unification.material.Materials;
import me.morishima.methoxymethane.common.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockNaturalGasSpring extends Block {
    public BlockNaturalGasSpring() {
        super(Material.ROCK);
        setHardness(10000);
        setResistance(10000);
        setCreativeTab(CommonProxy.TAB_DME);
        setTranslationKey("natural_gas_spring");
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (worldIn.getBlockState(pos.up(1)) == Blocks.AIR.getDefaultState()) {

        }

        worldIn.setBlockState(pos.up(1), Materials.NaturalGas.getFluid().getBlock().getDefaultState());

    }

}
