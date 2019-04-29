package com.loong.pattern.structural.decorator;

public class Battercake extends ABattercake {
    public String getDesc() {
        return "煎饼";
    }

    public int cost() {
        return 8;
    }
}
