package org.loong.lambda.Chapter2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        String str = "my name is 007";

        // 使用并行流
        str.chars().parallel().forEach(i -> System.out.print((char) i));
        System.out.println();
        // 使用 forEachOrdered 保证顺序
        str.chars().parallel().forEachOrdered(i -> System.out.print((char) i));

        // 转成list
        List<String> list = Stream.of(str.split(" ")).collect(Collectors.toList());

        System.out.println(list);

        // 使用 reduce 拼接字符串
        Optional<String> letters = Stream.of(str.split(" ")).reduce((s1, s2) -> s1 + "|" + s2);
        System.out.println(letters.orElse(""));

        // 带初始化值的reduce
        String reduce = Stream.of(str.split(" ")).reduce("", (s1, s2) -> s1 + "|" + s2);
        System.out.println(reduce);

        // 计算所有单词总长度
        Integer length = Stream.of(str.split(" ")).map(s -> s.length()).reduce(0, (s1, s2) -> s1 + s2);
        System.out.println(length);

        // max 的使用
        Optional<String> max = Stream.of(str.split(" ")).max((s1, s2) -> s1.length() - s2.length());
        System.out.println(max.get());

        List<String> strs = Arrays.asList("d", "b", "a", "c", "a");
        // 返回集合的第一个对象
        Optional<String> findFirst = strs.parallelStream().filter(e -> !e.equals("a")).findFirst();
        // 返回这个集合中，取到的任何一个对象
        Optional<String> findAny = strs.parallelStream().filter(e -> !e.equals("a")).findAny();

        // 全部满足条件才返回true，否则返回false
        boolean allMatch = Stream.of(1, 2, 3, 4).allMatch(e -> e > 0);

        // 只要有一个满足条件则返回true，否则返回false。
        boolean anyMatch = Stream.of(1, 2, 3, 4).anyMatch(e -> e > 3);

        // 全部不满足条件则返回true，否则返回false
        boolean noneMatch = Stream.of(1, 2, 3, 4, 5).noneMatch(e -> e > 10);
    }
}
