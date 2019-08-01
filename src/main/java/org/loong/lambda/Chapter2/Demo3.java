package org.loong.lambda.Chapter2;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        String str = "my name is 001";

        // 输出每个单词的长度
        // map，参数为一个函数，在这个函数中，处理集合中的元素，并将处理后的结果返回。
        Stream.of(str.split(" ")).map(s -> s.length()).forEach(System.out::println);

        // flatMap，处理完后必须返回Stream
        // intStream/longStream 并不是Stream的子类，所以要进行装箱，转成Stream
        Stream.of(str.split(" ")).flatMap(s -> s.chars().boxed()).forEach(System.out::println);

        // filter，对list中的数据进行过滤
        List<Integer> list1 = Lists.newArrayList(1, 2, 3, 4);
        list1.stream().filter(s -> s > 2).forEach(System.out::println);

        // peek用于debug
        Stream.of(str.split(" ")).peek(System.out::println).forEach(System.out::println);

        // distinct，对list2去重
        List<Integer> list2 = Lists.newArrayList(1, 2, 2, 4);
        list2.stream().distinct().forEach(System.out::println);

        // sorted，排序
        List<Integer> list3 = Lists.newArrayList(2, 1, 3, 4);
        list3 = list3.stream().sorted().collect(Collectors.toList());
        list3 = list3.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        //list3 = list3.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        //list3 = list3.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());

        // limit，打印1 - 4
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .limit(4)
                .forEach(i -> System.out.print(i + " "));

        // skip，打印3 - 10
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .skip(2)
                .forEach(i -> System.out.print(i + " "));
    }
}
