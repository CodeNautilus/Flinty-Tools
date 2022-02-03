package ace.flinty.tools.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {

    public AxeBase(ToolMaterial material) {
        super(material, 6, -3.2f, new Settings().group(ItemGroup.TOOLS));
    }
    
}