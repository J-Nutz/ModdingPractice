package com.jnutz.randomstuff.generation;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModGen {

    public static void init(){

        initOreGen();

    }

    public static void initOreGen(){

        registerWorldGen(new OreGen(), 1);

    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){

        GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);

    }

}
