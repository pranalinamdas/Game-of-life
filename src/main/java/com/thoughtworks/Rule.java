package com.thoughtworks;

public class Rule {
    protected int left;
    protected int self;
    protected int right;

    public Rule(int left, int self, int right){
        this.left = left;
        this.self = self;
        this.right = right;
    }
}
