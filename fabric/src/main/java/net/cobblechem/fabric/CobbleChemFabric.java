package net.cobblechem.fabric;

import net.cobblechem.CobbleChem;
import net.fabricmc.api.ModInitializer;

public class CobbleChemFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CobbleChem.init();
    }
}
