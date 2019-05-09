package com.loong.pattern.behavioal.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiongtaolong
 */
public class SubscriptionNumber implements Observed {

    private List<Observer> list = new ArrayList<>();
    private String notice;

    public SubscriptionNumber(){

    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list){
            observer.notice(notice);
        }
    }

    public void submit(String notice){
        this.notice = notice;
        this.notifyObserver();
    }
}
