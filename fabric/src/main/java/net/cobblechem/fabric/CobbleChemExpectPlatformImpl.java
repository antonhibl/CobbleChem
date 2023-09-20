package net.cobblechem.fabric;

import net.cobblechem.CobbleChemExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class CobbleChemExpectPlatformImpl {
    /**
     * This is our actual method to {@link CobbleChemExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
