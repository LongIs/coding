package org.loong.lambda.Chapter1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {
                                    //s是参数，右边是执行体
        Consumer<String> consumer1 = s -> System.out.println(12);

        // 当只有一个函数调用，并且使用的参数名是一样的话，可缩写成方法引用的方式
        Consumer<String> consumer2 = System.out::println;

        //静态调用(调用static方法)
        Function<String,String> function1 = ADemo4::add;
        function1.apply("ADemo4::add");
        //实例调用
        ADemo4 aDemo4 = new ADemo4();
        Function<Integer,Integer> function2 = aDemo4::add;
        function2.apply(2);
        //构造调用
        Supplier<ADemo4> supplier = ADemo4::new;
        supplier.get();

        List<Long> l1 = new ArrayList<>();
    }
}
class ADemo4{
    public ADemo4(){

    }
    public int add(int i){
        System.out.println("测试");
        return i;
    }
    public static String add(String s){
        System.out.println(s);
        return "测试";
    }



    private String name;

    /** 默认会把当前实例传入到非静态方法，参数名为this，位置是第一个 */
    public void getName(ADemo4 this,String name){
        this.name = name;
    }
}
