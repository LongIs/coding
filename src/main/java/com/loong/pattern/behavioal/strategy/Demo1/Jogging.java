package com.loong.pattern.behavioal.strategy.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:18
 */
public class Jogging implements Motion{

    @Override
    public void run() {
        System.out.println("慢跑");
    }
}
