package laserlemons.applepie.items;

import laserlemons.applepie.ApplePie;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;


public class ItemApplePie extends ItemFood {

    public ItemApplePie() {
        super(6, 0.8f, false);
        setUnlocalizedName("apple_pie");
        setRegistryName("apple_pie");
        setCreativeTab(CreativeTabs.FOOD);
    }

    public void registerItemModel() {
        ApplePie.proxy.registerItemRenderer(this, 0, "apple_pie");
    }

    public void initOreDict() {
        OreDictionary.registerOre("applePie", this);
    }

}