package me.Mqrshie.Marsh.module.Movement;

import org.lwjgl.input.Keyboard;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;
import net.minecraft.entity.Entity;

public class Parkour extends Module{

	public Parkour() {
		super("Parkour", 0, Category.MOVEMENT);
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.player.onGround && !mc.player.isSneaking() && !this.mc.gameSettings.keyBindSneak.pressed &&
					this.mc.world.getCollisionBoxes((Entity)mc.player, mc.player.getEntityBoundingBox().offset(0.0D, -0.5D, 0.0D).expand(-0.001D, 0.0D, -0.001D)).isEmpty())
				mc.player.jump();
		}
	}

}