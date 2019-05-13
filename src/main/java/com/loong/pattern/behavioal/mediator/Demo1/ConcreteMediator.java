package com.loong.pattern.behavioal.mediator.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-13 20:28
 */
public class ConcreteMediator extends Mediator{

    ColleagueA colleagueA;
    ColleagueB colleagueB;


    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void contact(String content, Colleague coll) {
        if (coll==colleagueA) {
            colleagueB.getMessage(content);
        } else {
            colleagueA.getMessage(content);
        }
    }
}
