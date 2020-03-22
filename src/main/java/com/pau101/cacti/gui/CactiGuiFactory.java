package com.pau101.cacti.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;

public class CactiGuiFactory implements IModGuiFactory {
	@Override
	public void initialize(Minecraft mc) {}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		return null;
	}

	@Override
	public GuiScreen createConfigGui(GuiScreen parent) {
		return null;
	}

	@Override
	public boolean hasConfigGui() {
		// TODO Auto-generated method stub
		return false;
	}
}
