package me.morishima.methoxymethane.api.unification.material.materials;

public class DMEElementMaterials {

    private static int startId = 10000;
    private static final int endId = startId + 1000;

    public static void register() {}

    private static int getId() {
        if (startId < endId) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }


}
