package me.morishima.methoxymethane.mixin.gregicality;

import gregicality.multiblocks.api.capability.IParallelMultiblock;
import gregicality.multiblocks.api.capability.impl.GCYMMultiblockRecipeLogic;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = GCYMMultiblockRecipeLogic.class)
public abstract class MixinGCYMMultiblockRecipeLogic extends MultiblockRecipeLogic {
    public MixinGCYMMultiblockRecipeLogic(RecipeMapMultiblockController tileEntity) {
        super(tileEntity);
    }

    public int getParallelLimit() {
        return ((IParallelMultiblock)this.metaTileEntity).isParallel() ? ((IParallelMultiblock)this.metaTileEntity).getMaxParallel() : 1;
    }

    @Override
    public void setMaxProgress(int maxProgress)
    {
        if(((IParallelMultiblock)this.metaTileEntity).getMaxParallel()<=16)
            this.maxProgressTime = maxProgress/((IParallelMultiblock)this.metaTileEntity).getMaxParallel();
        if(((IParallelMultiblock)this.metaTileEntity).getMaxParallel()==64)
            this.maxProgressTime = maxProgress*16/((IParallelMultiblock)this.metaTileEntity).getMaxParallel();
        if(((IParallelMultiblock)this.metaTileEntity).getMaxParallel()==256)
            this.maxProgressTime = maxProgress*128/((IParallelMultiblock)this.metaTileEntity).getMaxParallel();
        if(((IParallelMultiblock)this.metaTileEntity).getMaxParallel()>=1024)
            this.maxProgressTime = maxProgress;
    }
}
