
package net.mcreator.cooping.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.cooping.itemgroup.ModcoopItemGroup;
import net.mcreator.cooping.CoopingElements;

@CoopingElements.ModElement.Tag
public class RawmagmaoreItem extends CoopingElements.ModElement {
	@ObjectHolder("cooping:rawmagmaore")
	public static final Item block = null;
	public RawmagmaoreItem(CoopingElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ModcoopItemGroup.tab).maxStackSize(64));
			setRegistryName("rawmagmaore");
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
