package com.loong.pattern.creational.factorymethod;

public class JavaVideoFactory implements VideoFactory {
    public Video video() {
        return new JavaVideo();
    }
}
