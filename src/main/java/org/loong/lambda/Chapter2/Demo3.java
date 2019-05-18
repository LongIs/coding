package org.loong.lambda.Chapter2;

import java.util.Random;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        String str = "my name is 001";

         //把每个单词的长度掉出来
        Stream.of(str.split(" ")).map(s -> s.length()).forEach(System.out::println);

        //flatMap A -> B属性（是个集合），最终得到所有的A元素里面的所有B属性集合
        //intStream/longStream 并不是Stream的子类，所以要进行装箱
        Stream.of(str.split(" ")).flatMap(s ->s.chars().boxed()).forEach(System.out::println);

        //peek用于debug
        Stream.of(str.split(" ")).peek(System.out::println).forEach(System.out::println);

        // limit使用，主要用于无限流
        new Random().ints().filter(s -> s > 10 && s != 90).limit(10).forEach(System.out::println);
    }
}
