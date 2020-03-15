package com.enmuser.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    int calculate(int a, int b){
        int calculate = strategy.calculate(a, b);
        return calculate;
    }
}
