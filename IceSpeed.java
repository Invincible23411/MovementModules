package me.Mqrshie.Marsh.module.Movement;

import me.Mqrshie.Marsh.module.Category;
import me.Mqrshie.Marsh.module.Module;
import net.minecraft.init.Blocks;

public class IceSpeed extends Module{

	public IceSpeed() {
		super("IceSpeed", 0, Category.MOVEMENT);
	}

	@Override
    public void onEnable() {
        Blocks.ICE.slipperiness = Blocks.PACKED_ICE.slipperiness = Blocks.FROSTED_ICE.slipperiness = 1.075f;
    }
	
	@Override
	public void onDisable() {
		Blocks.ICE.slipperiness = Blocks.PACKED_ICE.slipperiness = Blocks.FROSTED_ICE.slipperiness = 0.97f;
	}
	
}
