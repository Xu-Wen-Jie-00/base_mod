package com.xuwenjie.item;

import com.xuwenjie.TemplateMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @Description [自定义物品]
 * @Author: 徐文杰
 * @Date: 2024/3/23  19:29
 */
public class ModItems {
    public static final Item ICE_ETHER = registerItems("ice_ether",new Item(new FabricItemSettings()));
    public static final Item RAW_ICE_ETHER = registerItems("raw_ice_ether",new Item(new FabricItemSettings()));
    private static void addItemsToItemGroups(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ICE_ETHER);
    }
    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroups);
    }
}
