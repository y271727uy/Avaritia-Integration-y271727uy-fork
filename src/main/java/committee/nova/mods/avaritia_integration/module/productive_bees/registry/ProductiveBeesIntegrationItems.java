package committee.nova.mods.avaritia_integration.module.productive_bees.registry;

import committee.nova.mods.avaritia_integration.AvaritiaIntegration;
import committee.nova.mods.avaritia_integration.module.productive_bees.item.ProductiveBeesItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public final class ProductiveBeesIntegrationItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, AvaritiaIntegration.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_LATTICE_COMB = register("diamond_lattice_comb", () -> new ProductiveBeesItem(new Item.Properties()));

    public static <T extends Item> RegistryObject<T> register(String id, Supplier<T> supplier) {
        return REGISTRY.register(id, supplier);
    }
}
