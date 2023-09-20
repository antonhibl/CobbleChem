package net.cobblechem.forge;

import net.cobblechem.CobbleChemExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class CobbleChemExpectPlatformImpl {
    /**
     * This is our actual method to {@link CobbleChemExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
