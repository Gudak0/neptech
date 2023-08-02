package nepjr.tech;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod("neptech")
public class NepTech
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public NepTech()
    {
        LOGGER.info("Hello from NepTech!");
    }
}
