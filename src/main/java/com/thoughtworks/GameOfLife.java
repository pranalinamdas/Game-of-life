package com.thoughtworks;

import java.util.List;

public class GameOfLife {

    private int[] world;
    private List<Rule> rule;

    public GameOfLife(int[] world, List<Rule> rule) {
        this.world = world;
        this.rule = rule;
    }

    public int[] evolve() {
        int[] paddedWorld = getPaddedWorld();
        return createNewWorld(paddedWorld, rule);
    }

    private int[] createNewWorld(int[] paddedWorld, List<Rule> rule) {
        int aliveCell = 1;
        int deadCell = 0;
        int[] nextWorld = new int[paddedWorld.length];

        for (Rule value : rule) {
            for (int i = 1; i < paddedWorld.length - 1; i++) {
                if (paddedWorld[i - 1] == value.left && paddedWorld[i] == value.self && paddedWorld[i + 1] == value.right) {
                    nextWorld[i] = aliveCell;
                }
                if (paddedWorld[i] != value.self) {
                    nextWorld[i] = deadCell;
                }
            }
        }
        return nextWorld;
    }

    private int[] getPaddedWorld() {
        int[] paddedWorld = new int[world.length + 2];

        paddedWorld[0] = 0;
        for (int i = 1; i < world.length + 1; i++) {
            paddedWorld[i] = world[i - 1];
        }
        paddedWorld[paddedWorld.length - 1] = 0;
        return paddedWorld;
    }
}
