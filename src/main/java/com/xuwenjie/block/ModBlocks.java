package com.xuwenjie.block;

import com.xuwenjie.TemplateMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

/**
 * @Description [自定义方块]
 * @Author: 徐文杰
 * @Date: 2024/3/23  20:48
 */
public class ModBlocks {
    public static final Block ICE_ETHER_BLOCK = registerBlocks("ice_ether_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block RAW_ICE_ETHER_BLOCK = registerBlocks("raw_ice_ether_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ICE_ETHER_ORE = registerBlocks("ice_ether_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),//经验掉落数量随机2~5
                    FabricBlockSettings.copyOf(Blocks.STONE)
//                            .strength(3f)//方块硬度
            ));

    private static Block registerBlocks(String name, Block block) {
        registerBlocksItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TemplateMod.MOD_ID, name), block);
    }

    private static Item registerBlocksItems(String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(TemplateMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {

    }
}
