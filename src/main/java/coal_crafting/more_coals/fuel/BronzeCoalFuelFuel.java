
package coal_crafting.more_coals.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import coal_crafting.more_coals.item.BronzeCoalItem;
import coal_crafting.more_coals.MoreCoalsModElements;

@MoreCoalsModElements.ModElement.Tag
public class BronzeCoalFuelFuel extends MoreCoalsModElements.ModElement {
	public BronzeCoalFuelFuel(MoreCoalsModElements instance) {
		super(instance, 20);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(BronzeCoalItem.block, (int) (1)).getItem())
			event.setBurnTime(4200);
	}
}
