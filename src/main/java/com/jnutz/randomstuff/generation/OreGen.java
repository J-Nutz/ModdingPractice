package com.jnutz.randomstuff.generation;

import com.jnutz.randomstuff.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){

        switch (world.provider.dimensionId){

            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);

            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);

            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }

    }

    private void generateNether(World world, Random random, int chunkX, int chunkZ) {

    }

    private void generateSurface(World world, Random random, int chunkX, int chunkZ) {

        /** 50 = times it can gen in chunk **/
        for(int i = 0; i < 50; i++){

            int randPosX = chunkX + random.nextInt(16);
            int randPosY = random.nextInt(64);
            int randPosZ = chunkZ + random.nextInt(16);

            /** 8 = is number of blocks per vein **/
            (new WorldGenMinable(ModBlocks.purpleOre, 8)).generate(world, random, randPosX, randPosY, randPosZ);

        }

    }

    private void generateEnd(World world, Random random, int chunkX, int chunkZ){

    }

}
