package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOfLifeTest {

    @Test
    void givenWorldOfOneCell_whenEvolve_thenShouldCreateNewWorldWithLiveCell(){
        int[] world = {0};
        int[] world1 = {0,1,0};
        int[] rule = {0,0,0};
        GameOfLife gol = new GameOfLife(world,rule);

        Assertions.assertArrayEquals(world1, gol.evolve());
    }
}
