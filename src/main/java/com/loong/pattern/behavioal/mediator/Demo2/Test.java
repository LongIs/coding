package com.loong.pattern.behavioal.mediator.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-13 21:14
 */
public class Test {
    public static void main(String[] args) {

        // 实例化同事A、B
        ConcreteColleagueA colleagueA = new ConcreteColleagueA();
        ConcreteColleagueB colleagueB = new ConcreteColleagueB();

        // 同时把同事A、B传入给中介者
        ConcreteMediator am = new ConcreteMediator();
        am.setColleagueA(colleagueA);
        am.setColleagueB(colleagueB);

        colleagueA.setString("AAAAA",am);
        colleagueB.setString("BBBBB",am);
    }
}
