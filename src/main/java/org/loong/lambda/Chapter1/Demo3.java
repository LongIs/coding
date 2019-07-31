package org.loong.lambda.Chapter1;

import java.text.DecimalFormat;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo3 {
    public static void main(String[] args) {
        // Lambda表达式只需要知道输入是什么，输出是什么这里是输入是Integer，输出是String
        Function<Integer,String> func1 = i -> (i * 2) + " ";
        // i -> (i * 2) + " "就相当于apply方法的具体实现
        String apply = func1.apply(10000);
        // 输出 20000
        System.out.println(apply);


        Function<Integer,Integer> func2 = i -> i * 10;
        Function<Integer,String> func3 = i -> i - 1 + " ";
        // 先处理参数，再对返回值使用操作after进行处理.func3即after
        String apply1 = func2.andThen(func3).apply(5);
        // 输出 49
        System.out.println(apply1);


        Function<Integer,Integer> func4 = i -> i * 10 - 1;
        // 和andThen刚好相反：先使用操作before处理参数，再对返回值进行处理。func4即before
        Integer apply2 = func2.compose(func4).apply(5);
        // 输出 490
        System.out.println(apply2);

        // 只有入参，没有出参
        Consumer<String> consumer=  p -> System.out.println(p);
        consumer.accept("ZX");

        // 只有出参，没有入参
        Supplier<String> supplier =  () -> "ZX";
        System.out.println(supplier.get());

        // 有入参和出参，出参为Boolean
        Predicate<Integer> predicate = e -> e > 100;
        System.out.println(predicate.test(1000));
    }
}

