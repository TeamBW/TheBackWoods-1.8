package com.chaka.thebackwoods;

import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
 
public class MFRHandler {
	
	@SubscribeEvent
	public void oredict(OreDictionary.OreRegisterEvent event) {
		if (event.Name == "Greggy_greg_do_please_kindly_stuff_a_sock_in_it_xxx") {
			int a = 1;
			while (a <= 5) {
				LogHelper.warn("Skyggy_sky_do_please_kindly_shut_up");
				a++;
			}
		}
	}
}
