package laserlemons.applepie;

import laserlemons.applepie.items.ItemApplePie;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemApplePie applePie = new ItemApplePie();

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                applePie
        );
    }

    public static void registerModels() {
        applePie.registerItemModel();
    }

}
