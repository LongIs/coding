package com.loong.pattern.behavioal.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author xiongtaolong
 * @date 2019-05-10 19:48
 */
public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("post的内容");
    }
}
