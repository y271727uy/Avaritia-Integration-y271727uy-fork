package committee.nova.mods.avaritia_integration.module.productive_bees;

import committee.nova.mods.avaritia_integration.module.Module;
import committee.nova.mods.avaritia_integration.module.ModuleEntry;
import committee.nova.mods.avaritia_integration.module.productive_bees.registry.ProductiveBeesIntegrationBlockEntities;
import committee.nova.mods.avaritia_integration.module.productive_bees.registry.ProductiveBeesIntegrationBlocks;
import committee.nova.mods.avaritia_integration.module.productive_bees.registry.ProductiveBeesIntegrationItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;

@ModuleEntry(id = ProductiveBeesModule.MOD_ID)
public final class ProductiveBeesModule implements Module {
	public static final String MOD_ID = "productivebees";

	@Override
	public void init(IEventBus registryBus) {
		ProductiveBeesIntegrationItems.REGISTRY.register(registryBus);
		ProductiveBeesIntegrationBlocks.REGISTRY.register(registryBus);
		ProductiveBeesIntegrationBlockEntities.REGISTRY.register(registryBus);
	}

	@Override
	public void collectCreativeTabItems(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
		// Add productive_bees items to the mod's creative tab
		for (RegistryObject<? extends Item> r : ProductiveBeesIntegrationItems.ITEMS) {
			output.accept(r.get());
		}
	}
}




