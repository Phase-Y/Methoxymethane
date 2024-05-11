package me.morishima.methoxymethane.common.metatileentities.multi.electric;

import gregicality.multiblocks.api.unification.GCYMMaterials;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockFusionCasing;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import me.morishima.methoxymethane.api.recipes.DMERecipeMaps;
import me.morishima.methoxymethane.client.DMETextures;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class MetaTileEntityCosmicLaserOscillationPlatform extends RecipeMapMultiblockController {
    public MetaTileEntityCosmicLaserOscillationPlatform(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, DMERecipeMaps.CLOP);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("    A    ", "         ", "         ", "         ", "         ", "         ")
                .aisle("  AAAAA  ", "   BBB   ", "    B    ", "    B    ", "         ", "         ")
                .aisle(" AAAAAAA ", "  B   B  ", "   C C   ", "   CBC   ", "    G    ", "         ")
                .aisle(" AADDDAA ", " B     B ", "  C   C  ", "  C   C  ", "   EEE   ", "    G    ")
                .aisle("AAADDDAAA", " B     B ", " B     B ", " BB   BB ", "  GEEEG  ", "   GFG   ")
                .aisle(" AADDDAA ", " B     B ", "  C   C  ", "  C   C  ", "   EEE   ", "    G    ")
                .aisle(" AAAAAAA ", "  B   B  ", "   C C   ", "   CBC   ", "    G    ", "         ")
                .aisle("  AAAAA  ", "   BBB   ", "    B    ", "    B    ", "         ", "         ")
                .aisle("    S    ", "         ", "         ", "         ", "         ", "         ")
                .where('A', states(MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING_MK3)))
                .where('B', blocks(MetaBlocks.FRAMES.get(GCYMMaterials.HSLASteel)))
                .where('C', states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)))
                .where('D', states(MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL)))
                .where('E', blocks(Blocks.EMERALD_BLOCK))
                .where('F', blocks(Blocks.BEACON))
                .where('G', states(MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING_MK3))
                        .or(autoAbilities(true, true, true, true, true, true, false)))
                .where('S', selfPredicate())
                .build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return DMETextures.FUSION_TEXTURE;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityCosmicLaserOscillationPlatform(metaTileEntityId);
    }
}
