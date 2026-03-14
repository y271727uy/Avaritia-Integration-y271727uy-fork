package committee.nova.mods.avaritia_integration.module.productive_bees.registry;

import committee.nova.mods.avaritia_integration.AvaritiaIntegration;
import committee.nova.mods.avaritia_integration.module.productive_bees.item.ProductiveBeesItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.LinkedList;
import java.util.List;

public final class ProductiveBeesIntegrationItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, AvaritiaIntegration.MOD_ID);

    public static final List<RegistryObject<? extends Item>> ITEMS = new LinkedList<>();

    public static final RegistryObject<Item> DIAMOND_LATTICE_COMB = register("diamond_lattice_comb", () -> new ProductiveBeesItem(new Item.Properties()));

    public static final RegistryObject<Item> CRYSTAL_MATRIX_COMB = register("crystal_matrix_comb", () -> new ProductiveBeesItem(new Item.Properties()));

    public static final RegistryObject<Item> BLAZE_CUBE_COMB = register("blaze_cube_comb", () -> new ProductiveBeesItem(new Item.Properties()));

    // Nutronium comb (no animation)
    public static final RegistryObject<Item> NUTRONIUM_COMB = register("nutronium_comb", () -> new ProductiveBeesItem(new Item.Properties()));

    // Infinity comb (animated) - animation meta should be provided as infinity_comb.png.mcmeta next to the texture
    public static final RegistryObject<Item> INFINITY_COMB = register("infinity_comb", () -> new ProductiveBeesItem(new Item.Properties()));

    // Star fuel comb (no animation)
    public static final RegistryObject<Item> STAR_FUEL_COMB = register("star_fuel_comb", () -> new ProductiveBeesItem(new Item.Properties()));



    public static <T extends Item> RegistryObject<T> register(String id, Supplier<T> supplier) {
        RegistryObject<T> r = REGISTRY.register(id, supplier);
        ITEMS.add(r);
        return r;
    }
}
