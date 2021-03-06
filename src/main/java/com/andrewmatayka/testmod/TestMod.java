package com.andrewmatayka.testmod;

import com.andrewmatayka.testmod.reference.Reference;

import cpw.mods.fml.common.Mod;

import com.andrewmatayka.testmod.handler.ConfigurationHandler;
import com.andrewmatayka.testmod.init.ModBlocks;
import com.andrewmatayka.testmod.init.ModItems;
import com.andrewmatayka.testmod.proxy.IProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TestMod {
	@Mod.Instance(Reference.MOD_ID)
	public static TestMod instance;
	
	@SidedProxy(clientSide = "com.andrewmatayka.testmod.proxy.ClientProxy", serverSide = "com.andrewmatayka.testmod.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register((new ConfigurationHandler()));
		
		ModItems.init();
		
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
