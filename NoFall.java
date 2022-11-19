package me.Mqrshie.Marsh.module.Movement;

import org.lwjgl.input.Keyboard;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;
import net.minecraft.network.play.client.CPacketPlayer;

public class NoFall extends Module{

	public NoFall() {
		super("Nofall", 0, Category.MOVEMENT);
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.player.fallDistance > 2f) {
				mc.player.connection.sendPacket(new CPacketPlayer(true));
			}
			super.onUpdate();
		}
	}
}