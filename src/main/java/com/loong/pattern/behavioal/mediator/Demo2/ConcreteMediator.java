package com.loong.pattern.behavioal.mediator.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-13 21:07
 */
public class ConcreteMediator implements AbstractMediator {

    ConcreteColleagueA concreteColleagueA;
    ConcreteColleagueB concreteColleagueB;

    /**
     * 传入同事A的对象
     * @param colleagueA
     */
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.concreteColleagueA = colleagueA;
    }

    /**
     * 传入同事B的对象
     * @param colleagueB
     */
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.concreteColleagueB = colleagueB;
    }

    @Override
    public void aChangedB(String str) {
        concreteColleagueB.changeString(str);
    }

    @Override
    public void bChangedA(String str) {
        concreteColleagueA.changeString(str);
    }
}
