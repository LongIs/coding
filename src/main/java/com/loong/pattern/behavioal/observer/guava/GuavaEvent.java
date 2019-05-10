package com.loong.pattern.behavioal.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author xiongtaolong
 * @date 2019-05-10 19:49
 */
public class GuavaEvent {
    @Subscribe
    public void doAction(String s){
        System.out.println(s);
    }
}
