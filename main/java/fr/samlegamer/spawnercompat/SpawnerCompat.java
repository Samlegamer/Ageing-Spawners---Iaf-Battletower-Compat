package fr.samlegamer.spawnercompat;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SpawnerCompat.MODID)
public class SpawnerCompat
{
	public static final String MODID = "spawnercompat";
	
	public SpawnerCompat()
	{
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		MinecraftForge.EVENT_BUS.register(new SpawnersEvents.ICEANDFIRE());
		MinecraftForge.EVENT_BUS.register(new SpawnersEvents.BRASSAMBERBATTLETOWER());
	}
}