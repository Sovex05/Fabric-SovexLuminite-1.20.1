package net.sovex.luminite.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sovex.luminite.SovexsLuminite;
import net.sovex.luminite.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup LUMINITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SovexsLuminite.MOD_ID, "luminite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.luminite"))
                    .icon(() -> new ItemStack(ModItems.LUMINITE_CRYSTAL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LUMINITE_CRYSTAL);

                        entries.add(ModBlocks.LUMINITE_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        SovexsLuminite.LOGGER.info("Registering Item Groups for " + SovexsLuminite.MOD_ID);
    }
}
