package com.andrewmatayka.testmod.init;

import com.andrewmatayka.testmod.block.BlockFlag;
import com.andrewmatayka.testmod.block.BlockTM;
import com.andrewmatayka.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockTM flag = new BlockFlag();
	
	public static void init() {
		GameRegistry.registerBlock(flag, "flag");
	}
}
