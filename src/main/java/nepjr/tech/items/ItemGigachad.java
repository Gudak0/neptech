package nepjr.tech.items;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;

public class ItemGigachad extends BowlFoodItem
{
    public ItemGigachad(Properties props)
    {
        super(props);
    }

    @Override
    public boolean isEdible()
    {
        return true;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity)
    {
        if (entity instanceof ServerPlayer)
        {
            ((ServerPlayer) entity).setGameMode(GameType.CREATIVE);
        }
        return stack;
    }
}
