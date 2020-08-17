package com.lninyu.lninyumod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TestBlock1 extends Block {
    public TestBlock1(){
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.0f,1.0f)
                .lightValue(14)
        );
        setRegistryName("testblock1");
    }
}
