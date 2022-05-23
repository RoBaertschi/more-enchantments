package ch.fantasticgame28.moreent.enchantments;

import ch.fantasticgame28.moreent.MoreEnchantments;
import ch.fantasticgame28.moreent.enchantments.custom.LevitationEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

	public static Enchantment LEVITATION = Registry.register(
			Registry.ENCHANTMENT,
			new Identifier("moreent", "levitation"),
			new LevitationEnchantment()
	);

	public static void registerEnchantments() {
		MoreEnchantments.LOGGER.info("Registering Enchantments!");
	}
}
