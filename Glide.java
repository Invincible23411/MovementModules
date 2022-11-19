package me.Mqrshie.Marsh.module.Movement;

import org.lwjgl.input.Keyboard;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;
import net.minecraft.block.material.Material;

public class Glide extends Module{

	public Glide() {
		super("Glide", 0, Category.MOVEMENT);
	}
	
	public void onUpdate() {
		double oldY = mc.player.motionY;
		float oldJ = mc.player.jumpMovementFactor;
		if(this.isToggled()) {
			if((mc.player.motionY < 0.0d) && (mc.player.isAirBorne) && (!mc.player.isInWater()) && (!mc.player.isOnLadder())) {
				if(!mc.player.isInsideOfMaterial(Material.LAVA)) {
					mc.player.motionY = -.125d;
					mc.player.jumpMovementFactor *= 1.12337f;
				}
			}
		}else {
			mc.player.motionY = oldY;
			mc.player.jumpMovementFactor = oldJ;
		}
	}

}


