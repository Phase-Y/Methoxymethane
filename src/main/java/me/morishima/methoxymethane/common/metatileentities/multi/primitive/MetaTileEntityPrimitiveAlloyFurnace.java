package me.morishima.methoxymethane.common.metatileentities.multi.primitive;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregtech.api.capability.impl.PrimitiveRecipeLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapPrimitiveMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.util.GTTransferUtils;
import gregtech.api.util.GTUtility;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import me.morishima.methoxymethane.common.blocks.DMEMetaBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MetaTileEntityPrimitiveAlloyFurnace extends RecipeMapPrimitiveMultiblockController {
    public MetaTileEntityPrimitiveAlloyFurnace(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.ALLOY_SMELTER_RECIPES);
        this.recipeMapWorkable = new RecipeLogic(this, RecipeMaps.ALLOY_SMELTER_RECIPES);
    }

    @Override
    protected void updateFormedValid() {}

    @Override public boolean hasMufflerMechanics() {return false;}
    @Override public boolean hasMaintenanceMechanics() {return false;}

    @Override
    @SideOnly(Side.CLIENT)
    public void addDisplayText(List<ITextComponent> tooltip) {
        tooltip.add(new TextComponentString(String.format("Heat: %s", ((RecipeLogic) recipeMapWorkable).burnTime)));
    }

    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        this.getFrontOverlay().renderOrientedState(renderState, translation, pipeline, this.getFrontFacing(), this.recipeMapWorkable.isActive(), this.recipeMapWorkable.isWorkingEnabled());
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("BBB", "BBB", "BBB")
                .aisle("BBB", "BAB", "BBB")
                .aisle("BBB", "BCB", "BBB")
                .where('B', states(DMEMetaBlocks.MULTIBLOCK_BLOCKS.getDefaultState())
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS))
                        .or(abilities(MultiblockAbility.EXPORT_ITEMS)))
                .where('C', selfPredicate())
                .where('A', air())
                .build();
    }

    @SideOnly(Side.CLIENT)
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.PRIMITIVE_BRICKS;
    }

    @SideOnly(Side.CLIENT)
    protected @NotNull ICubeRenderer getFrontOverlay() {
        return Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityPrimitiveAlloyFurnace(metaTileEntityId);
    }


    public class RecipeLogic extends PrimitiveRecipeLogic {

        public int burnTime = 100;

        public RecipeLogic(RecipeMapPrimitiveMultiblockController tileEntity, RecipeMap<?> recipeMap) {
            super(tileEntity, recipeMap);
        }

        //@Override
        protected boolean aaa() {
            return super.canRecipeProgress; //&& burnTime > 0;
        }

        //@Override
        protected void aa() {
            if (this.canRecipeProgress && this.drawEnergy(this.recipeEUt, true)) {
                this.drawEnergy(this.recipeEUt, false);
                //burnTime--;

                if (burnTime <= 0) {
                    //progressTime--;
                }

                if (++this.progressTime > this.maxProgressTime) {
                    this.completeRecipe();
                }

                if (this.hasNotEnoughEnergy && this.getEnergyInputPerSecond() > 19L * (long)this.recipeEUt) {
                    this.hasNotEnoughEnergy = false;
                }
            } else if (this.recipeEUt > 0) {
                this.hasNotEnoughEnergy = true;
                this.decreaseProgress();
            }
        }

        //@Override
        public void updateA() {
            List<ItemStack> stacks = GTUtility.itemHandlerToList(getInputInventory());
            for (ItemStack stack : stacks) {
                if (TileEntityFurnace.isItemFuel(stack)) {
                    if (stack.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null)) {
                        burnTime = burnTime + (Objects.requireNonNull(GTUtility.getFluidFromContainer(stack)).amount / 1000) * TileEntityFurnace.getItemBurnTime(stack);
                        GTTransferUtils.addItemsToItemHandler(getExportItems(), false, Collections.singletonList(new ItemStack(stack.getItem())));
                    }
                    getInputInventory().extractItem(stacks.indexOf(stack), 1, false);
                    burnTime = burnTime + TileEntityFurnace.getItemBurnTime(stack);
                }
            }
            super.update();
        }
    }
}
