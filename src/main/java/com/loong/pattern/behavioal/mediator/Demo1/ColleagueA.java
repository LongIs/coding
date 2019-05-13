package com.loong.pattern.behavioal.mediator.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-13 20:28
 */
public class ColleagueA extends Colleague {
    public ColleagueA(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String str){
        System.out.println(name+":"+str);
    }

    public void contact(String str){
        mediator.contact(str,this);
    }
}
