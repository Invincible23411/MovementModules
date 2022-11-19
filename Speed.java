package me.Mqrshie.Marsh.module.Movement;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;

public class Speed extends Module{

	public Speed() {
		super("Speed", 0, Category.MOVEMENT);
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.player.onGround) {
				mc.player.motionX *= 2.0f;
				mc.player.motionZ *= 2.0f;
			}
		}
	}

}
