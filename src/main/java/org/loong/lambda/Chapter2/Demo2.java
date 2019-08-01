package org.loong.lambda.Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        // 集合创建
        List<Integer> list = new ArrayList<>();
        list.stream();
        list.parallelStream(); // 并行流，可能产生线程安全问题

        // 数组创建
        Arrays.stream(new int[]{1, 2, 3});

        // 数字流创建
        IntStream.of(1, 2, 3);
        // - 不包含10
        IntStream.range(1, 10);
        // - 包含最10
        IntStream.rangeClosed(1, 10);

        // Random创建
        new Random().ints().limit(10);

        // 自己创建
        Random random = new Random();
        Stream.generate(() -> random.nextInt()).limit(20);
    }
}
