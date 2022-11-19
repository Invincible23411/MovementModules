package me.Mqrshie.Marsh.module.Movement;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;

public class Sneak extends Module{

	public Sneak() {
		super("Sneak", 0, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.gameSettings.keyBindSneak.pressed = true;
		}
	}
	
	@Override
	public void onDisable() {
		mc.gameSettings.keyBindSneak.pressed = false;
		super.onDisable();
	}

}