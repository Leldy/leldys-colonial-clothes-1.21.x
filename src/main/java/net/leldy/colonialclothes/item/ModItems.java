package net.leldy.colonialclothes.item;

import net.leldy.colonialclothes.ColonialClothes;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ColonialClothes.MOD_ID);

    public static final DeferredItem<Item> BROCADE = ITEMS.register("Brocade",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
