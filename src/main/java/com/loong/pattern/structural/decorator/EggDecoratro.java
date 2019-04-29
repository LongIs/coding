package com.loong.pattern.structural.decorator;

public class EggDecoratro extends AbstractDecorator{


    public EggDecoratro(ABattercake aBattercake){
        super(aBattercake);
    }

    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    public int cost() {
        return super.cost() + 2;
    }
}
