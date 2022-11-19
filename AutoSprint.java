package me.Mqrshie.Marsh.module.Movement;

import org.lwjgl.input.Keyboard;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;

public class AutoSprint extends Module {

	public AutoSprint() {
		super("AutoSprint", Keyboard.KEY_V, Category.MOVEMENT);
	}

	public void onEnable() {
		if(this.isToggled()) {
			mc.player.setSprinting(true);
			super.onEnable();
		}
	}
	
	public void onDisable() {
		mc.player.setSprinting(false);
		super.onDisable();
	}
	
}
