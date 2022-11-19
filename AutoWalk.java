package me.Mqrshie.Marsh.module.Movement;

import org.lwjgl.input.Keyboard;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;

public class AutoWalk extends Module{

	public AutoWalk() {
		super("AutoWalk", 0, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.gameSettings.keyBindForward.pressed = true;
		}
			
	}
	@Override
	public void onDisable() {
		mc.gameSettings.keyBindForward.pressed = false;
		super.onDisable();
	}
	
}
