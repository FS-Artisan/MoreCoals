
package coal_crafting.more_coals.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import coal_crafting.more_coals.item.CoalCrystalItem;
import coal_crafting.more_coals.MoreCoalsModElements;

@MoreCoalsModElements.ModElement.Tag
public class CoalsExpandItemGroup extends MoreCoalsModElements.ModElement {
	public CoalsExpandItemGroup(MoreCoalsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcoals_expand") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CoalCrystalItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
