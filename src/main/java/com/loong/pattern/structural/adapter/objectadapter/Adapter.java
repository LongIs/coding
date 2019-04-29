package com.loong.pattern.structural.adapter.objectadapter;

/**
 * Created by geely
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
