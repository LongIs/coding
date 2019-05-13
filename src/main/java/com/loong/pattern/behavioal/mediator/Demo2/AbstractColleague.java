package com.loong.pattern.behavioal.mediator.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-13 21:03
 */
public abstract class AbstractColleague {

    /**
     * 同事对象在改变的时候，通知中介者，并传递影响值
     * @param str
     * @param am
     */
    public abstract void setString(String str, AbstractMediator am);


    /**
     * 同事对象提供一个接口接收中介者传递的影响值
     * @param str
     */
    public abstract void changeString(String str);
}
