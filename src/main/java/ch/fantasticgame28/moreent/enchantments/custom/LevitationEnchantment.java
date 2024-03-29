package ch.fantasticgame28.moreent.enchantments.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class LevitationEnchantment extends Enchantment {
	public LevitationEnchantment() {
		super(Rarity.COMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {
				EquipmentSlot.OFFHAND,
				EquipmentSlot.MAINHAND
		});
	}

	@Override
	public int getMinPower(int level) {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public void onTargetDamaged(LivingEntity user, Entity target, int level) {
		if (target instanceof LivingEntity) {
			((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20 * 3, 1));
		}

		super.onTargetDamaged(user, target, level);
	}
}
