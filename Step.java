package me.Mqrshie.Marsh.module.Movement;

import org.lwjgl.input.Keyboard;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;
import net.minecraft.network.play.client.CPacketPlayer;

public class Step extends Module{

	public Step() {
		super("Step", 0, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if((mc.player.isCollidedHorizontally) && (mc.player.onGround)) {
				mc.player.connection.sendPacket(new CPacketPlayer.Position(mc.player.posX, mc.player.posY+0.42, mc.player.posZ, mc.player.onGround));
				mc.player.connection.sendPacket(new CPacketPlayer.Position(mc.player.posX, mc.player.posY+0.72, mc.player.posZ, mc.player.onGround));
				mc.player.stepHeight = 2.0f;
			}
		
	}else {
		mc.player.stepHeight = 1f;
	}
	}

}