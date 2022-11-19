package me.Mqrshie.Marsh.module.Movement;

import org.lwjgl.input.Keyboard;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;

public class Dolphin extends Module{

	public Dolphin() {
		super("Dolphin", 0, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.player.isInWater()) {
				mc.player.motionY += 0.04;
			}
		}
	}

}
