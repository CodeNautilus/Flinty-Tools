package ace.flinty.tools;

import ace.flinty.tools.items.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FlintyTools implements ModInitializer {


	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("flintytools", "flint_shovel"), new ShovelBase(new ToolMaterialFlint()));
		Registry.register(Registry.ITEM, new Identifier("flintytools", "flint_pickaxe"), new PickaxeBase(new ToolMaterialFlint()));
		Registry.register(Registry.ITEM, new Identifier("flintytools", "flint_axe"), new AxeBase(new ToolMaterialFlint()));
		Registry.register(Registry.ITEM, new Identifier("flintytools", "flint_hoe"), new HoeBase(new ToolMaterialFlint()));
		Registry.register(Registry.ITEM, new Identifier("flintytools", "flint_sword"), new SwordBase(new ToolMaterialFlint()));
	}
}
