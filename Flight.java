package me.Mqrshie.Marsh.module.Movement;

import org.lwjgl.input.Keyboard;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;

public class Flight extends Module{
	
	public static float flyHackSpeed = 0.1f;

	public Flight() {
		super("Flight", 0, Category.MOVEMENT);
	}
	
	public void onDisable() {
		mc.player.capabilities.isFlying = false;
		super.onDisable();
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			mc.player.capabilities.isFlying = true;
			
			if(mc.gameSettings.keyBindJump.isPressed()) {
				mc.player.motionY += 0.2f;
			}
			
			if(mc.gameSettings.keyBindSneak.isPressed()) {
				mc.player.motionY -= 0.2f;
			}
			
			if(mc.gameSettings.keyBindForward.isPressed()) {
				mc.player.capabilities.setFlySpeed(flyHackSpeed);
			}
			
			super.onDisable();
			
		}
	}
	
	

}