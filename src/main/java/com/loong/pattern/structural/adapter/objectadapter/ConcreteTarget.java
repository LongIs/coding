package com.loong.pattern.structural.adapter.objectadapter;


/**
 * Created by geely
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
