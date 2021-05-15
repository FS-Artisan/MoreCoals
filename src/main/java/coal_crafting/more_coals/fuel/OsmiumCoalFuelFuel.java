
package coal_crafting.more_coals.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import coal_crafting.more_coals.item.OsmiumCoalItem;
import coal_crafting.more_coals.MoreCoalsModElements;

@MoreCoalsModElements.ModElement.Tag
public class OsmiumCoalFuelFuel extends MoreCoalsModElements.ModElement {
	public OsmiumCoalFuelFuel(MoreCoalsModElements instance) {
		super(instance, 14);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(OsmiumCoalItem.block, (int) (1)).getItem())
			event.setBurnTime(4400);
	}
}
