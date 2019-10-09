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

        int[] nextWorld = new int[paddedWorld.length];

        for (Rule value : rule) {
            applyRule(paddedWorld, nextWorld, value);
        }
        return nextWorld;
    }

    private void applyRule(int[] paddedWorld, int[] nextWorld, Rule value) {
        int aliveCell = 1;
        int deadCell = 0;

        for (int i = 1; i < paddedWorld.length - 1; i++) {
            if (value.isMatch(paddedWorld, value, i)) {
                nextWorld[i] = aliveCell;
            }
            if (value.isSelfMatch(paddedWorld[i], value)) {
                nextWorld[i] = deadCell;
            }
        }
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
