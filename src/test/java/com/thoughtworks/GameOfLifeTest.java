package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GameOfLifeTest {

    @Test
    void givenWorldOfOneCell_whenEvolve_thenShouldCreateNewWorldWithLiveCell() {
        int[] world = {0};
        int[] newWorld = {0, 1, 0};
        Rule rule = new Rule(0, 0, 0);

        List<Rule> listOfRules = new ArrayList<>();
        listOfRules.add(rule);

        GameOfLife gameOfLife = new GameOfLife(world, listOfRules);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }

    @Test
    void givenWorldOfTwoCell_whenEvolve_thenShouldCreateNewWorld() {
        int[] world = {0, 0};
        int[] newWorld = {0, 1, 1, 0};
        Rule rule = new Rule(0, 0, 0);

        List<Rule> listOfRules = new ArrayList<>();
        listOfRules.add(rule);

        GameOfLife gameOfLife = new GameOfLife(world, listOfRules);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }

    @Test
    void givenWorldOfThreeCell_whenEvolve_thenShouldCreateNewWorld() {
        int[] world = {0, 0, 0};
        int[] newWorld = {0, 1, 1, 1, 0};
        Rule rule = new Rule(0, 0, 0);

        List<Rule> listOfRules = new ArrayList<>();
        listOfRules.add(rule);

        GameOfLife gameOfLife = new GameOfLife(world, listOfRules);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }

    @Test
    void givenWorldOfFourCell_whenEvolve_thenShouldCreateNewWorld() {
        int[] world = {0, 0, 0, 0};
        int[] newWorld = {0, 0, 0, 0, 0, 0};

        Rule rule = new Rule(0, 1, 0);

        List<Rule> listOfRules = new ArrayList<>();
        listOfRules.add(rule);

        GameOfLife gameOfLife = new GameOfLife(world, listOfRules);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }

    @Test
    void givenWorld_whenEvolve_thenShouldCreateNewWorld() {
        int[] world = {0, 1, 0, 1};
        int[] newWorld = {0, 0, 1, 0, 1, 0};

        Rule rule = new Rule(0, 1, 0);

        List<Rule> listOfRules = new ArrayList<>();
        listOfRules.add(rule);

        GameOfLife gameOfLife = new GameOfLife(world, listOfRules);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }

    @Test
    void givenWorld_whenEvolveWithTwoRules_thenShouldCreateNewWorld() {
        int[] world = {0, 1, 0, 1};
        int[] newWorld = {0, 0, 0, 0, 0, 0};

        Rule rule1 = new Rule(0, 1, 0);
        Rule rule2 = new Rule(0, 0, 0);

        List<Rule> listOfRules = new ArrayList<>();
        listOfRules.add(rule1);
        listOfRules.add(rule2);

        GameOfLife gameOfLife = new GameOfLife(world, listOfRules);

        Assertions.assertArrayEquals(newWorld, gameOfLife.evolve());
    }
}
