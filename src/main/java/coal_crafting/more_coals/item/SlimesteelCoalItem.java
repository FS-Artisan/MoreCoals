
package coal_crafting.more_coals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import coal_crafting.more_coals.itemgroup.CoalsExpandItemGroup;
import coal_crafting.more_coals.MoreCoalsModElements;

@MoreCoalsModElements.ModElement.Tag
public class SlimesteelCoalItem extends MoreCoalsModElements.ModElement {
	@ObjectHolder("more_coals:slimesteel_coal")
	public static final Item block = null;
	public SlimesteelCoalItem(MoreCoalsModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CoalsExpandItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("slimesteel_coal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
