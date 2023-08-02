package nepjr.tech.factory;

import nepjr.tech.items.ItemGigachad;
import nepjr.tech.misc.ModFoods;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemFactory
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "neptech");

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    public static final RegistryObject<Item> GIGACHAD = ITEMS.register("gigachad", () -> new ItemGigachad(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.GIGACHAD)));
}
