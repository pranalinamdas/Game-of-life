package com.thoughtworks;

public class Rule {
    private int left;
    private int self;
    private int right;

    public Rule(int left, int self, int right) {
        this.left = left;
        this.self = self;
        this.right = right;
    }


     boolean isMatch(int[] paddedWorld, Rule value, int cell) {
        return paddedWorld[cell - 1] == value.left && paddedWorld[cell] == value.self && paddedWorld[cell + 1] == value.right;
    }

     boolean isSelfMatch(int cell, Rule value) {
        return cell != value.self;
    }
}
