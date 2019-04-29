package com.loong.pattern.structural.decorator;

public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecoratro(aBattercake);
        aBattercake = new EggDecoratro(aBattercake);
        aBattercake = new SausageDecoratro(aBattercake);
        System.out.println(aBattercake.getDesc() +"--"+aBattercake.cost());
    }
}
