package com.loong.pattern.creational.singleton.sing3;

/**
 * @description:
 * @author: TaoLong
 * @create: 2018/10/31 21:23
 **/
public class StaticClassSingleton {
    private StaticClassSingleton(){

    }

    private static class StaticClass{
        private static StaticClassSingleton staticClassSingleton = new StaticClassSingleton();
    }
    public static StaticClassSingleton getStatic(){
        return StaticClass.staticClassSingleton;
    }
}
