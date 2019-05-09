package com.loong.pattern.behavioal.observer;

/**
 * @author xiongtaolong
 * @date 2019-05-09 19:58
 */
public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name){
        this.name = name;
    }


    @Override
    public void notice(String notice) {
        System.out.println(name+"订阅者收到消息："+notice);
    }
}
