package kan3.dnamod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import kan3.dnamod.client.renders.DNARenderRegistry;
import kan3.dnamod.config.Config;
import kan3.dnamod.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("dnamod")
public class DNAMod 
{
	public static DNAMod instance;
	public static final String MODID = "dnamod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static final ItemGroup DNA = new DNAItemGroup();
	
	public DNAMod() 
	{	
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER, "dnamod-server.toml");
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT, "dnamod-client.toml");
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		Config.loadConfig(Config.CLIENT, FMLPaths.CONFIGDIR.get().resolve("dnamod-client.toml").toString());
		Config.loadConfig(Config.SERVER, FMLPaths.CONFIGDIR.get().resolve("dnamod-server.toml").toString());
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		OreGeneration.setupOreGeneration();
		LOGGER.info("Setup registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event)
	{
		DNARenderRegistry.registryEntityRenders();
		LOGGER.info("ClientRegistries registered.");
	}
}
