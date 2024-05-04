package me.morishima.methoxymethane.loaders.recipes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static gregtech.loaders.recipe.CraftingComponent.PLATE;

public class DMECraftingComponent {

    public static void rewriteCraftingComponent() {
        PLATE.appendIngredients(
                Stream.of(new Object[][] {
                        {10, }
                }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1]))
        );
    }

}
