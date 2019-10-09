package com.thoughtworks;

public class GameOfLife {

    private int[] world;
    private Rule rule;

    // TODO - use rule
    public GameOfLife(int[] world, Rule rule) {
        this.world = world;
        this.rule = rule;
    }

    public int[] evolve() {
        int[] paddedWorld = getPaddedWorld();
        return createNewWorld(paddedWorld,rule);
    }

    private int[] createNewWorld(int[] paddedWorld,Rule rule) {
        int aliveCell = 1;
        int[] nextWorld = new int[paddedWorld.length];

        for (int i = 1; i < paddedWorld.length - 1; i++) {

                if (paddedWorld[i - 1] == rule.left && paddedWorld[i] == rule.self && paddedWorld[i + 1] == rule.right) {
                    nextWorld[i] = aliveCell;
                }
        }
        return nextWorld;
    }

    private int[] getPaddedWorld() {
        int[] paddedWorld = new int[world.length + 2];

        paddedWorld[0] = 0;
        for (int i = 1; i < world.length+1; i++) {
            paddedWorld[i] = world[i - 1];
        }
        paddedWorld[paddedWorld.length - 1] = 0;
        return paddedWorld;
    }
}
