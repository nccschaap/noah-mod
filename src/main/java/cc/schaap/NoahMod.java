package cc.schaap;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoahMod implements ModInitializer {
	public static final String MOD_ID = "noah_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("noah-mod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}