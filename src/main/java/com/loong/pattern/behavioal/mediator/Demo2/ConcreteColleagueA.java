package com.loong.pattern.behavioal.mediator.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-13 21:05
 */
public class ConcreteColleagueA extends AbstractColleague{

    @Override
    public void setString(String str, AbstractMediator am) {
        am.aChangedB(str);
    }

    @Override
    public void changeString(String str) {
        System.out.println("b通知a改变："+str);
    }
}
