package com.loong.pattern.behavioal.mediator.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-13 20:28
 */
public class Colleague {

    protected String name;
    protected Mediator mediator;

    public Colleague(String name , Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
}
