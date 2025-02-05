package net.sovex.luminite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sovex.luminite.SovexsLuminite;

public class ModItems {

    public static final Item LUMINITE_SHARD = registerItem("luminite_shard", new Item(new FabricItemSettings()));
    public static final Item LUMINITE_CRYSTAL = registerItem("luminite_crystal", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(LUMINITE_SHARD);
        entries.add(LUMINITE_CRYSTAL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SovexsLuminite.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SovexsLuminite.LOGGER.info("Registering Mod Items for " + SovexsLuminite.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
