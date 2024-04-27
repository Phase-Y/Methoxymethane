package me.morishima.methoxymethane.api.utils;

import gregtech.api.unification.material.Material;
import net.minecraft.util.ResourceLocation;

import static gregtech.api.unification.material.MarkerMaterials.Tier.*;

public class DMEUtils {
    public static final String[] VN =
    {
            "ULV", "LV", "MV", "HV",
            "EV", "IV", "LuV", "ZPM",
            "UV", "UHV", "UEV", "UIV",
            "UXV", "OpV", "MAX"
    };
    public static final Material[] VNT =
            {
                    ULV, LV, MV, HV,
                    EV, IV, LuV, ZPM,
                    UV, UHV, UEV, UIV,
                    UXV, OpV, MAX
            };

    public DMEUtils() {
    }

    public static ResourceLocation dmeId(String path) {
        return new ResourceLocation("methoxymethane", path);
    }

    public static Material toTierMaterial(int tier) {
        if (tier > 14 || tier < 0) return ULV;
        return VNT[tier];
    }

    public static String toTierName(int tier) {
        if (tier > 14 || tier < 0) return "ULV";
        return VN[tier];
    }
}
