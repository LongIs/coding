package com.loong.pattern.behavioal.templatemethod;

public abstract class Calculator {

    public final void calculation(){
        String hook = this.hook();
        int result = 0;
        switch (hook){
            case "+": result = this.one() + this.two() + this.three();
            break;
            case "*": result = this.one() * this.two() * this.three();
            break;
        }
        System.out.println(result);
    }

    private final int one(){
        return 10;
    }

    abstract int two();

    abstract int three();

    abstract String hook();
}
