
package coal_crafting.more_coals.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import coal_crafting.more_coals.item.SlimesteelCoalItem;
import coal_crafting.more_coals.MoreCoalsModElements;

@MoreCoalsModElements.ModElement.Tag
public class SlimesteelCoalFuelFuel extends MoreCoalsModElements.ModElement {
	public SlimesteelCoalFuelFuel(MoreCoalsModElements instance) {
		super(instance, 31);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(SlimesteelCoalItem.block, (int) (1)).getItem())
			event.setBurnTime(8000);
	}
}
