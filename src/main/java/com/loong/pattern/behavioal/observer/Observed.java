package com.loong.pattern.behavioal.observer;

/**
 * @author xiongtaolong
 * @date 2019-05-09 19:46
 * 被观察者
 */
public interface Observed {

    /**
     * 添加观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
