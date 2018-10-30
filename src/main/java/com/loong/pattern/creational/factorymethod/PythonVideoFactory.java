package com.loong.pattern.creational.factorymethod;

public class PythonVideoFactory implements VideoFactory {
    public Video video() {
        return new PythonVideo();
    }
}
