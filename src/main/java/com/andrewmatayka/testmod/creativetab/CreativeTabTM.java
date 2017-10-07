package com.andrewmatayka.testmod.creativetab;

import com.andrewmatayka.testmod.init.ModItems;
import com.andrewmatayka.testmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM {
	public static final CreativeTabs TM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return ModItems.mapleLeaf;
		}
	};
}
