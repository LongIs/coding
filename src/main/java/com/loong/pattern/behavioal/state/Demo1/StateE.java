package com.loong.pattern.behavioal.state.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-15 20:04
 */
public class StateE implements State{
    @Override
    public void handle() {
        System.out.println("调用的是 StateE");
    }
}
