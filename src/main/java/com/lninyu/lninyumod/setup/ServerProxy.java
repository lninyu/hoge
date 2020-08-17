package com.lninyu.lninyumod.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("only run this on the client");
    }
}
