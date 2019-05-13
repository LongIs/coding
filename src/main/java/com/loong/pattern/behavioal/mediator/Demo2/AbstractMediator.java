package com.loong.pattern.behavioal.mediator.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-13 20:58
 * 抽象中介者
 */
public interface AbstractMediator {

    /**
     * 中介者通过此方法来改变同事B
     * @param str
     */
    void aChangedB(String str);

    /**
     * 中介者通过此方法来改变同事A
     * @param str
     */
    void bChangedA(String str);
}
