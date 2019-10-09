package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOfLifeTest {

    @Test
    void givenWorldOfOneCell_whenEvolve_thenShouldCreateNewWorldWithLiveCell(){
        int[] world = {0};
        int[] newWorld = {0,1,0};
        Rule rule = new Rule(0,0,0);
        GameOfLife gameOfLife = new GameOfLife(world,rule);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }

    @Test
    void givenWorldOfTwoCell_whenEvolve_thenShouldCreateNewWorld(){
        int[] world = {0,0};
        int[] newWorld = {0,1,1,0};
        Rule rule = new Rule(0,0,0);
        GameOfLife gameOfLife = new GameOfLife(world,rule);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }

    @Test
    void givenWorldOfThreeCell_whenEvolve_thenShouldCreateNewWorld(){
        int[] world = {0,0,0};
        int[] newWorld = {0,1,1,1,0};
        Rule rule = new Rule(0,0,0);
        GameOfLife gameOfLife = new GameOfLife(world,rule);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }

    @Test
    void givenWorldOfFourCell_whenEvolve_thenShouldCreateNewWorld(){
        int[] world = {0,0,0,0};
        int[] newWorld = {0,0,0,0,0,0};

        Rule rule = new Rule(0,1,0);
        GameOfLife gameOfLife = new GameOfLife(world, rule);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }

    @Test
    void givenWorld_whenEvolve_thenShouldCreateNewWorld(){
        int[] world = {0,1,0,1};
        int[] newWorld = {0,0,1,0,1,0};

        Rule rule = new Rule(0,1,0);
        GameOfLife gameOfLife = new GameOfLife(world, rule);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }
}
