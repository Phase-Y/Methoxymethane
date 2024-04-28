package me.morishima.methoxymethane.common.items.items;

import me.morishima.methoxymethane.api.item.DMEStandardMetaItem;
import me.morishima.methoxymethane.common.CommonProxy;

import static me.morishima.methoxymethane.common.items.DMEMetaItems.Misc.*;

public class DMEMetaItemMisc extends DMEStandardMetaItem {

    public DMEMetaItemMisc() {
        setRegistryName("misc");
        setCreativeTab(CommonProxy.TAB_DME);
    }

    public void registerSubItems() {
        RAW_INSULATING_SILICON_BRICK = this.addItem(0, "brick.insulating_silicon.raw");
        INSULATING_SILICON_BRICK = this.addItem(1, "brick.insulating_silicon");
        BRICK_BLANK = this.addItem(2, "blank.brick");
    }

}
