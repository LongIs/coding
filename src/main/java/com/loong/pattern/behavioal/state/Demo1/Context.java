package com.loong.pattern.behavioal.state.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-15 20:03
 */
public class Context {

    private State state = new StateA();

    public void setState(State state){
        this.state = state;
    }

    public void print(){
        state.handle();
    }

}
