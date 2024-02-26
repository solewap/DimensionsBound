package pl.solewap.dimensionsbound.blocks;

        import net.minecraft.util.valueproviders.UniformInt;
        import net.minecraft.world.item.BlockItem;
        import net.minecraft.world.item.CreativeModeTab;
        import net.minecraft.world.item.Item;
        import net.minecraft.world.level.block.Block;
        import net.minecraft.world.level.block.state.BlockBehaviour;
        import net.minecraft.world.level.material.Material;
        import net.minecraftforge.eventbus.api.IEventBus;
        import net.minecraftforge.registries.DeferredRegister;
        import net.minecraftforge.registries.ForgeRegistries;
        import net.minecraftforge.registries.RegistryObject;
        import pl.solewap.dimensionsbound.DimensionsBound;
        import pl.solewap.dimensionsbound.item.ModCreativeModeTab;
        import pl.solewap.dimensionsbound.item.ModItems;

        import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DimensionsBound.MOD_ID);

    public static final RegistryObject<Block> COBBLED_SHADOWSTONE = registerBlock("cobbled_shadowstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIMENSIONSBOUND_TAB);

    public static final RegistryObject<Block> CRACKED_SHADOWSTONE_BRICKS = registerBlock("cracked_shadowstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIMENSIONSBOUND_TAB);
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIMENSIONSBOUND_TAB);
    public static final RegistryObject<Block> SHADOWSAND = registerBlock("shadowsand",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f)), ModCreativeModeTab.DIMENSIONSBOUND_TAB);
    public static final RegistryObject<Block> SHADOWSTONE = registerBlock("shadowstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIMENSIONSBOUND_TAB);
    public static final RegistryObject<Block> SHADOWSTONE_BRICKS = registerBlock("shadowstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIMENSIONSBOUND_TAB);
    public static final RegistryObject<Block> SHADOWSTONE_IRON_ORE = registerBlock("shadowstone_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIMENSIONSBOUND_TAB);
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIMENSIONSBOUND_TAB);
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIMENSIONSBOUND_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
