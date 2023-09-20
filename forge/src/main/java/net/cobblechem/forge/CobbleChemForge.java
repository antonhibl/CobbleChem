package net.cobblechem.forge;

import dev.architectury.platform.forge.EventBuses;
import net.cobblechem.CobbleChem;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CobbleChem.MOD_ID)
public class CobbleChemForge {
    public CobbleChemForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(CobbleChem.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        CobbleChem.init();
    }
}
