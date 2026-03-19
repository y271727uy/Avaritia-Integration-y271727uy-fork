package committee.nova.mods.avaritia_integration.module.productive_bees.registry;

import committee.nova.mods.avaritia_integration.AvaritiaIntegration;
import committee.nova.mods.avaritia_integration.module.productive_bees.entity.NeutroniumCollectorNestBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public final class ProductiveBeesIntegrationBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, AvaritiaIntegration.MOD_ID);

    public static final RegistryObject<BlockEntityType<NeutroniumCollectorNestBlockEntity>> NEUTRONIUM_COLLECTOR_NEST = register(
            "neutronium_collector_nest",
            () -> BlockEntityType.Builder.of(
                    NeutroniumCollectorNestBlockEntity::new,
                    ProductiveBeesIntegrationBlocks.neutronium_collector_nest
            ).build(null)
    );

    private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String id, Supplier<BlockEntityType<T>> supplier) {
        return REGISTRY.register(id, supplier);
    }
}

