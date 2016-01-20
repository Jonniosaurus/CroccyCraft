/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jonnyedwards.croccycraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

@Mod(modid = "croccy", name = "Croccy Craft", version = "1.0")
public class CroccyCraft {
	
	public static Item itemCroccy;
	public static Block blockCroc;
	
	// Item and Block Init and registration
	// Config handling
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		itemCroccy = new ItemCroccy().setUnlocalizedName("ItemCroccy").setTextureName("croccy:itemCroccy");
		blockCroc = new BlockCroc(Material.dragonEgg).setBlockName("BlockCroc").setBlockTextureName("croccy:blockCroc");
		
		GameRegistry.registerItem(itemCroccy, itemCroccy.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCroc, blockCroc.getUnlocalizedName().substring(5));
	}
	
	// Proxy, TileEntity, entity, GUI and Packet registering
	@EventHandler
	public void init(FMLInitializationEvent event) {
	
	}
	
	// useful for cross-referencing what other mods have been installed 
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	
	}
	
}
