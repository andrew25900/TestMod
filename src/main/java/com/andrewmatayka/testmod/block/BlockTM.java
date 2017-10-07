package com.andrewmatayka.testmod.block;

import com.andrewmatayka.testmod.creativetab.CreativeTabTM;
import com.andrewmatayka.testmod.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockTM extends Block{
	public BlockTM (Material material) {
		super (material);
		this.setCreativeTab(CreativeTabTM.TM_TAB);
	}
	
	public BlockTM () {
		this(Material.rock);
		this.setCreativeTab(CreativeTabTM.TM_TAB);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly (Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
