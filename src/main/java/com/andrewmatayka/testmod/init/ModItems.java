package com.andrewmatayka.testmod.init;

import com.andrewmatayka.testmod.item.*;
import com.andrewmatayka.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemTM mapleLeaf = new ItemMapleLeaf();
	
	public static void init() {
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
