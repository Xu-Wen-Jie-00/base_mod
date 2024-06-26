package com.xuwenjie;

import com.xuwenjie.block.ModBlocks;
import com.xuwenjie.item.ModItemGroup;
import com.xuwenjie.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "template-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();//初始化物品
		ModItemGroup.registerModItemGroup();//初始化物品栏
		ModBlocks.registerModBlocks();//初始化方块
	}
}