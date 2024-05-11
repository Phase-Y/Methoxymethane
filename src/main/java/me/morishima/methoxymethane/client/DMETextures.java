package me.morishima.methoxymethane.client;

import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

public class DMETextures {
    public static SimpleOverlayRenderer DIELECTRIC_RUBBER_CASING;
    public static SimpleOverlayRenderer FUSION_TEXTURE;

    public DMETextures() {}

    public static void preInit() {
        DIELECTRIC_RUBBER_CASING = new SimpleOverlayRenderer("casings/multiblock/dielectric_rubber_casing");
        FUSION_TEXTURE = new SimpleOverlayRenderer("casings/fusion/machine_casing_fusion_3");
    }

}
