package nepjr.tech;

import com.mojang.logging.LogUtils;
import nepjr.tech.factory.ItemFactory;
import nepjr.tech.setup.ServerSetup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("neptech")
public class NepTech
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public NepTech()
    {
        ItemFactory.init();

        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ServerSetup::init);
        LOGGER.info("Hello from NepTech!");
    }
}
