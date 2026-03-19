package committee.nova.mods.avaritia_integration.module.productive_bees.registry;

import committee.nova.mods.avaritia_integration.AvaritiaIntegration;
import committee.nova.mods.avaritia_integration.module.productive_bees.block.NeutroniumCollectorNestBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public final class ProductiveBeesIntegrationBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(Registries.BLOCK, AvaritiaIntegration.MOD_ID);

    // Simple cube block used for comb_blaze_cube. Texture should be provided at
    // assets/avaritia_integration/textures/block/productive_bees/comb_blaze_cube.png (all faces same).
    public static final Block comb_blaze_cube = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK));

    public static final RegistryObject<Block> COMB_BLAZE_CUBE = register("comb_blaze_cube", () -> comb_blaze_cube);

    // Additional comb blocks (all simple cube blocks, textures at textures/block/productive_bees)
    public static final Block comb_diamond_lattice = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK));
    public static final Block comb_crystal_matrix = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK));
    public static final Block comb_nutronium = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK));
    public static final Block comb_infinity = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK));
    public static final Block comb_star_fuel = new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK));
    public static final Block neutronium_collector_nest = new NeutroniumCollectorNestBlock(BlockBehaviour.Properties.copy(Blocks.BEE_NEST));

    public static final RegistryObject<Block> COMB_DIAMOND_LATTICE = register("comb_diamond_lattice", () -> comb_diamond_lattice);
    public static final RegistryObject<Block> COMB_CRYSTAL_MATRIX = register("comb_crystal_matrix", () -> comb_crystal_matrix);
    public static final RegistryObject<Block> COMB_NUTRONIUM = register("comb_nutronium", () -> comb_nutronium);
    public static final RegistryObject<Block> COMB_INFINITY = register("comb_infinity", () -> comb_infinity);
    public static final RegistryObject<Block> COMB_STAR_FUEL = register("comb_star_fuel", () -> comb_star_fuel);
    public static final RegistryObject<Block> NEUTRONIUM_COLLECTOR_NEST = register("neutronium_collector_nest", () -> neutronium_collector_nest);

    private static <T extends Block> RegistryObject<T> register(String id, Supplier<T> obj) {
        return register(id, obj, true, b -> new BlockItem(b, new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> register(String id, Supplier<T> obj, boolean hasItem, Function<Block, Item> itemBuilder) {
        RegistryObject<T> r = REGISTRY.register(id, obj);
        if (hasItem) ProductiveBeesIntegrationItems.register(id, () -> itemBuilder.apply(r.get()));
        return r;
    }
}

