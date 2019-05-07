package com.loong.pattern.behavioal.strategy.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:17
 */
public class RunFast implements Motion {
    @Override
    public void run() {
        System.out.println("快跑");
    }
}
