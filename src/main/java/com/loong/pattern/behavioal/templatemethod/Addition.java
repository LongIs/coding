package com.loong.pattern.behavioal.templatemethod;

/**
 * @author xiongtaolong
 * @date 2019-05-07 11:28
 */
public class Addition extends Calculator {
    int two;
    int three;
    String hook;

    @Override
    int two() {
        return two;
    }

    @Override
    int three() {
        return three;
    }

    @Override
    String hook() {
        return hook;
    }

    public void setTwo(int two){
        this.two = two;
    }

    public void setThree(int three){
        this.three = three;
    }

    public void setHook(String hook){
        this.hook = hook;
    }
}
