package ace.flinty.tools.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {

    public HoeBase(ToolMaterial material) {
        super(material, -1, -2, new Settings().group(ItemGroup.TOOLS));
    }
    
}