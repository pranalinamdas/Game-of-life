package com.thoughtworks;

public class GameOfLife {

    private int[] world;

    public GameOfLife(int[] world, int[] rule) {
        this.world = world;
    }

    public int[] evolve() {

        int[] dummyWorld = getArray();

        return createNewWorld(dummyWorld);
    }

    private int[] createNewWorld(int[] dummyWorld) {
        int aliveCell = 1;
        int deadCell = 0;
        int[] nextWorld = new int[dummyWorld.length];

        for (int i = 1; i < dummyWorld.length - 1; i++) {

            if (dummyWorld[i] == deadCell) {
                if (dummyWorld[i - 1] == deadCell && dummyWorld[i + 1] == deadCell) {
                    nextWorld[i] = aliveCell;
                }
            }
        }
        return nextWorld;
    }

    private int[] getArray() {
        int[] createArray = new int[world.length + 2];

        createArray[0] = 0;
        for (int i = 1; i < world.length; i++) {
            createArray[i] = world[i - 1];
        }
        createArray[createArray.length - 1] = 0;
        return createArray;
    }
}
