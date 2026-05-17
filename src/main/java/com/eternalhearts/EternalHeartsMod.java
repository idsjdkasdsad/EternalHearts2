package com.eternalhearts;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("eternalhearts")
public class EternalHeartsMod {
    
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, "eternalhearts");
    
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, "eternalhearts");
    
    // MATERIALS
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
        () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
        () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> VOIDITE = ITEMS.register("voidite",
        () -> new Item(new Item.Properties()));
    
    // WEAPONS
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
        () -> new SwordItem(Tiers.IRON, 5, -2.4f, new Item.Properties()));
    
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
        () -> new SwordItem(Tiers.DIAMOND, 7, -2.4f, new Item.Properties()));
    
    // BLOCKS
    public static final RegistryObject<Block> HEART_CRYSTAL_BLOCK = BLOCKS.register("heart_crystal_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    
    public static final RegistryObject<Item> HEART_CRYSTAL_BLOCK_ITEM = ITEMS.register("heart_crystal_block",
        () -> new BlockItem(HEART_CRYSTAL_BLOCK.get(), new Item.Properties()));
    
    public EternalHeartsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
    }
}
