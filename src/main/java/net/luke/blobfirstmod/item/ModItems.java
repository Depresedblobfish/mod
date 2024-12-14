package net.luke.blobfirstmod.item;

import net.luke.blobfirstmod.BlobFirstMod;
import net.luke.blobfirstmod.item.custom.FuelItem;
import net.luke.blobfirstmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlobFirstMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_NUGGET = ITEMS.register("sapphire_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPRESSED_BIOMASS = ITEMS.register("compressed_biomass",
            () -> new FuelItem(new Item.Properties(),2000));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties()
                    .durability(120)
                    .rarity(Rarity.RARE)

            ));

public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}

