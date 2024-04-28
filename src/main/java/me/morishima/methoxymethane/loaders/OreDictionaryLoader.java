package me.morishima.methoxymethane.loaders;

import gregtech.api.unification.OreDictUnifier;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.List;

public class OreDictionaryLoader {

    public static void init(){
        loadOredict();
    }

    public static void loadOredict(){
        List<ItemStack> dustSiO2 = new ArrayList<>();
        dustSiO2.addAll(OreDictionary.getOres("dustCertusQuartz"));
        dustSiO2.addAll(OreDictionary.getOres("dustNetherQuartz"));
        dustSiO2.addAll(OreDictionary.getOres("dustQuartzite"));
        dustSiO2.addAll(OreDictionary.getOres("dustSiliconDioxide"));
        dustSiO2.addAll(OreDictionary.getOres("dustGlass"));
        dustSiO2.addAll(OreDictionary.getOres("dustQuartzSand"));
        dustSiO2.addAll(OreDictionary.getOres("dustFlint"));
        dustSiO2.forEach(OreDictionaryLoader::registerSiO);
    }

    private static void registerSiO(ItemStack stack) {
        OreDictUnifier.registerOre(stack, "dustGeneralSiliconDioxide");
    }

}
