package pl.solewap.dimensionsbound.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static pl.solewap.dimensionsbound.DimensionsBound.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIMENSIONSBOUND_TAB)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIMENSIONSBOUND_TAB)));
    public static final RegistryObject<Item> RAW_SILVER= ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIMENSIONSBOUND_TAB)));
    public static final RegistryObject<Item> DB_LOGO = ITEMS.register("db_logo",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
