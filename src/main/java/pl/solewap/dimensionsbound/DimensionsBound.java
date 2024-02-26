package pl.solewap.dimensionsbound;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import pl.solewap.dimensionsbound.blocks.ModBlocks;
import pl.solewap.dimensionsbound.item.ModItems;
import pl.solewap.dimensionsbound.world.feature.ModConfiguredFeatures;
import pl.solewap.dimensionsbound.world.feature.ModPlacedFeatures;

@Mod(DimensionsBound.MOD_ID)
public class DimensionsBound {
    //test
    public static final String MOD_ID = "dimensionsbound";
    private static final Logger LOGGER = LogUtils.getLogger();


    public DimensionsBound() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();



        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        ModConfiguredFeatures.CONFIGURED_FEATURE.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
