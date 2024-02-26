package pl.solewap.dimensionsbound.world.feature;

import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import pl.solewap.dimensionsbound.DimensionsBound;
import pl.solewap.dimensionsbound.blocks.ModBlocks;

import java.util.List;
import java.util.function.Supplier;


public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURE =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, DimensionsBound.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState())
    ));

    public static final RegistryObject<ConfiguredFeature<?,?>> SILVER_ORE = CONFIGURED_FEATURE.register("silver_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORE.get(), 9) ));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURE.register(eventBus);
    }
}
