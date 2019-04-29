package com.loong.pattern.structural.decorator;

public class SausageDecoratro extends AbstractDecorator {


    public SausageDecoratro(ABattercake aBattercake){
        super(aBattercake);
    }

    public String getDesc() {
        return super.getDesc() + "加一个火腿";
    }

    public int cost() {
        return super.cost() + 4;
    }
}
