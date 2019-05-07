package com.loong.pattern.behavioal.templatemethod;

/**
 * @author xiongtaolong
 * @date 2019-05-07 11:31
 */
public class Test {
    public static void main(String[] args) {
        Calculator addition = new Addition();
        ((Addition) addition).setTwo(10);
        ((Addition) addition).setThree(10);
        ((Addition) addition).setHook("+");
        addition.calculation();
    }
}
