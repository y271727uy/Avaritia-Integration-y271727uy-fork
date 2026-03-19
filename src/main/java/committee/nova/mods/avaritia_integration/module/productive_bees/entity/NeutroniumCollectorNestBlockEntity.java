package committee.nova.mods.avaritia_integration.module.productive_bees.entity;

import committee.nova.mods.avaritia_integration.module.productive_bees.registry.ProductiveBeesIntegrationBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class NeutroniumCollectorNestBlockEntity extends BlockEntity {
    public NeutroniumCollectorNestBlockEntity(BlockPos pos, BlockState state) {
        super(ProductiveBeesIntegrationBlockEntities.NEUTRONIUM_COLLECTOR_NEST.get(), pos, state);
    }
}

