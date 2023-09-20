package net.cobblechem;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class CobbleChem {
    public static final String MOD_ID = "cobblechem";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    public static final CreativeModeTab COBBLECHEM_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "cobblechem_tab"), () ->
            new ItemStack(CobbleChem.UNOWNIUM.get()));
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<Item> UNOWNIUM = ITEMS.register("unown_element", () ->
            new Item(new Item.Properties().tab(CobbleChem.COBBLECHEM_TAB)));
    
    public static void init() {
        ITEMS.register();
        
        System.out.println(CobbleChemExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
