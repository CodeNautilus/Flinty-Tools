package ace.flinty.tools.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialFlint implements ToolMaterial {

    @Override
    public int getDurability() {
        return 95;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 3;
    }

    @Override
    public float getAttackDamage() {
        return 0.5f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(Items.FLINT);
    }

}