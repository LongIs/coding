package com.loong.pattern.behavioal.mediator.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-13 21:05
 */
public class ConcreteColleagueB extends AbstractColleague {

    @Override
    public void setString(String str, AbstractMediator am) {
        am.bChangedA(str);
    }

    @Override
    public void changeString(String str) {
        System.out.println("a通知b改变："+str);
    }
}
