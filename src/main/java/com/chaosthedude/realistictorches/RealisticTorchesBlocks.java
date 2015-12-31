package com.chaosthedude.realistictorches;

import com.chaosthedude.realistictorches.blocks.BlockMovingLightSource;
import com.chaosthedude.realistictorches.blocks.BlockTorchLit;
import com.chaosthedude.realistictorches.blocks.BlockTorchSmoldering;
import com.chaosthedude.realistictorches.blocks.BlockTorchUnlit;
import com.chaosthedude.realistictorches.blocks.te.TEMovingLightSource;
import com.chaosthedude.realistictorches.blocks.te.TETorch;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class RealisticTorchesBlocks {

	public static BlockTorchUnlit torchUnlit;
	public static BlockTorchLit torchLit;
	public static BlockTorchSmoldering torchSmoldering;
	public static BlockMovingLightSource movingLightSource;
	public static TEMovingLightSource teMovingLightSource;
	public static TETorch teTorch;

	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}

	public static void initializeBlock() {
		torchUnlit = new BlockTorchUnlit();
		torchLit = new BlockTorchLit();
		torchSmoldering = new BlockTorchSmoldering();
		movingLightSource = new BlockMovingLightSource();
		teMovingLightSource = new TEMovingLightSource();
		teTorch = new TETorch();
	}

	public static void registerBlock() {
		GameRegistry.registerBlock(torchUnlit, torchUnlit.name);
		GameRegistry.registerBlock(torchLit, torchLit.name);
		GameRegistry.registerBlock(torchSmoldering, torchSmoldering.name);
		GameRegistry.registerBlock(movingLightSource, movingLightSource.name);
		GameRegistry.registerTileEntity(TEMovingLightSource.class, teMovingLightSource.name);
		GameRegistry.registerTileEntity(TETorch.class, teTorch.name);
	}

}