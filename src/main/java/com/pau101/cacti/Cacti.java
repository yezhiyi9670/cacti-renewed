package com.pau101.cacti;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.pau101.cacti.config.Configurator;
import com.pau101.cacti.gui.GuiContainerCactiCreative;

@Mod(
	modid = Cacti.MODID,
	name = Cacti.NAME,
	version = Cacti.VERSION,
	clientSideOnly = true,
	guiFactory = "com.pau101.cacti.gui.CactiGuiFactory"
)
public class Cacti {
	public static final String MODID = "cacti";

	public static final String NAME = "Cacti";

	public static final String VERSION = "1.0.2";

	@EventHandler
	public void init(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
		Configurator.init(event);
	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (Cacti.MODID.equals(event.getModID())) {
			Configurator.update();
		}
	}

	@SubscribeEvent
	public void onOpenGui(GuiOpenEvent event) {
		if (event.getGui() instanceof GuiContainerCreative) {
			event.setGui(new GuiContainerCactiCreative(Minecraft.getMinecraft().player));
		}
	}
}
