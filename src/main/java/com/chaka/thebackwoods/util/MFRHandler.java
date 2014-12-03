package com.chaka.thebackwoods.util;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

public class MFRHandler {
	
	@SubscribeEvent
	public void oredict(OreDictionary.OreRegisterEvent event) {
		if (event.Name == "Greggy_greg_do_please_kindly_stuff_a_sock_in_it_xxx") {
			int a = 1;
			while (a <= 5) {
				LogHandler.warn("Skyggy_sky_do_please_kindly_shut_up");
				a++;
			}
		}
	}
}
