package net.hunter.create_overproduced.item;

import net.hunter.create_overproduced.CreateOverproduced;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateOverproduced.MOD_ID);

//    public static final DeferredItem<Item> CREATIVE_POWDER = ITEMS.register("creative_powder",
//            () -> new Item(new Item.Properties())
//    );
//    public static final DeferredItem<Item> CREATIVE_BLAZE_CAKE_BASE = ITEMS.register("creative_blaze_cake_base",
//            () -> new Item(new Item.Properties())
//    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}