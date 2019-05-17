package org.loong.lambda.Chapter1;

import java.util.function.Function;

/**
 * 级联表达式和柯里化
 * 柯里化：把多个参数的函数转为只有一个函数的参数
 * 柯里化的目的：函数标准化
 */
public class Demo5 {
    public static void main(String[] args) {
        //实现了x+y的级联表达式
        Function<Integer,Function<Integer,Integer>> fun1 = x -> y -> x+y;
        System.out.println(fun1.apply(3).apply(4));

        Function<Integer,Function<Integer,Function<Integer,Integer>>> fun2 = x -> y -> z -> x+y+z;
        System.out.println(fun2.apply(4).apply(5).apply(6));
    }
}
