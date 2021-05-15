
package coal_crafting.more_coals.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import coal_crafting.more_coals.item.RedstoneCoalItem;
import coal_crafting.more_coals.MoreCoalsModElements;

@MoreCoalsModElements.ModElement.Tag
public class RedstoneCoalFuelFuel extends MoreCoalsModElements.ModElement {
	public RedstoneCoalFuelFuel(MoreCoalsModElements instance) {
		super(instance, 12);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(RedstoneCoalItem.block, (int) (1)).getItem())
			event.setBurnTime(4000);
	}
}
