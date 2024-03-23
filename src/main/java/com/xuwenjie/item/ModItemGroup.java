package com.xuwenjie.item;

import com.xuwenjie.TemplateMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * @Description []
 * @Author: 徐文杰
 * @Date: 2024/3/23  20:30
 */
public class ModItemGroup {
    public static final ItemGroup TEMPLATE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TemplateMod.MOD_ID,"template_group"), FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.template_group"))//鼠标移动到物品栏显示的名字
                    .icon(()-> new ItemStack(ModItems.ICE_ETHER))//物品栏图标
                    .entries((displayContext,entries)->{//物品栏内包含的物品
                        entries.add(ModItems.ICE_ETHER);
                        entries.add(Items.BOOK);
                        entries.add(Blocks.GRASS_BLOCK);
                    })
                    .build());
    public static void registerModItemGroup(){

    }
}
