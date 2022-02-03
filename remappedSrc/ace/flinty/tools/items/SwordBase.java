package ace.flinty.tools.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial material) {
        super(material, 2, -2.4f, new Settings().group(ItemGroup.COMBAT));
    }
    
}