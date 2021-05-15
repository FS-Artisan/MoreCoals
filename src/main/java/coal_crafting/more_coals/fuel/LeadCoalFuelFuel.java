
package coal_crafting.more_coals.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import coal_crafting.more_coals.item.LeadCoalItem;
import coal_crafting.more_coals.MoreCoalsModElements;

@MoreCoalsModElements.ModElement.Tag
public class LeadCoalFuelFuel extends MoreCoalsModElements.ModElement {
	public LeadCoalFuelFuel(MoreCoalsModElements instance) {
		super(instance, 8);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(LeadCoalItem.block, (int) (1)).getItem())
			event.setBurnTime(4200);
	}
}
