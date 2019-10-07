package com.thoughtworks;

public class GameOfLife {

    private int[] world;
    private int deadCell = 0;
    private int aliveCell = 1;

    public GameOfLife(int[] world, int[] rule) {
        this.world = world;
    }

    public int[] evolve() {

        int[] dummyWorld = getArray();

        return createNewWorld(dummyWorld);
    }

    private int[] createNewWorld(int[] dummyWorld) {
        for (int i = 1; i < dummyWorld.length - 1; i++) {

            if (dummyWorld[i] == deadCell) {
                if (dummyWorld[i - 1] == deadCell && dummyWorld[i + 1] == deadCell) {
                    dummyWorld[i] = aliveCell;
                }
            }
        }
        return dummyWorld;
    }

    private int[] getArray() {
        int[] dummyWorld = new int[world.length + 2];

        dummyWorld[0] = 0;
        for (int i = 1; i < world.length; i++) {
            dummyWorld[i] = world[i - 1];
        }
        dummyWorld[dummyWorld.length - 1] = 0;
        return dummyWorld;
    }
}
