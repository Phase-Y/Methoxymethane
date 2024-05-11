package me.morishima.methoxymethane.common.metatileentities.multi.electric;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import me.morishima.methoxymethane.api.recipes.DMERecipeMaps;
import me.morishima.methoxymethane.client.DMETextures;
import me.morishima.methoxymethane.common.blocks.DMEBlocks;
import me.morishima.methoxymethane.common.blocks.metablock.DMEBlockMultiblock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;

public class MetaTileEntityElectricFoilPlatingFactory extends RecipeMapMultiblockController {
    public MetaTileEntityElectricFoilPlatingFactory(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, DMERecipeMaps.PLATTER);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("AAA", "AAA", "AAA")
                .aisle("AAA", "ACA", "ADA")
                .aisle("AAA", "ABA", "AAA")
                .where('A', states(DMEBlocks.MULTIBLOCK_BLOCKS.getState(DMEBlockMultiblock.BlockType.DIELECTRIC_RUBBER_CASING))
                        .or(autoAbilities(true, true, true, true, true, false, false))
                )
                .where('B', selfPredicate())
                .where('C', air())
                .where('D', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.TEMPERED_GLASS)))
                .build();
    }

    @Override public boolean hasMufflerMechanics() {return false;}

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return DMETextures.DIELECTRIC_RUBBER_CASING;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public @NotNull ICubeRenderer getFrontOverlay() {
        return Textures.SCANNER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityElectricFoilPlatingFactory(metaTileEntityId);
    }
}
