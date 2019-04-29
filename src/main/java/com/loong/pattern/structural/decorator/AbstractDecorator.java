package com.loong.pattern.structural.decorator;

public abstract class AbstractDecorator extends ABattercake {

    ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }


    public String getDesc() {
        return aBattercake.getDesc();
    }

    public int cost() {
        return aBattercake.cost();
    }
}
