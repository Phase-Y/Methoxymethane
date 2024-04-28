package me.morishima.methoxymethane;

import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.ArrayList;
import java.util.List;

public class DMELateMixinLoader implements ILateMixinLoader {
    @Override
    public List<String> getMixinConfigs() {
        List<String> mixinConfigs = new ArrayList<>();
        mixinConfigs.add("mixins.methoxymethane.json");
        return mixinConfigs;
    }
}
