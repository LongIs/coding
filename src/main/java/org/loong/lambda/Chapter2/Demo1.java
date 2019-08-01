package org.loong.lambda.Chapter2;

import java.util.stream.IntStream;

public class Demo1 {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4};
        int temp = 0;
        // 外部迭代
        for (int s : i) {
            temp += s;
        }
        System.out.println(temp);

        // 使用Stream的内部迭代
        // map就是中间操作(返回Stream操作)
        // sum就是终止操作
        int sum = IntStream.of(i).map(s -> s * 2).sum();
        System.out.println(sum);

        System.out.println("惰性求值就是终止操作没有调用的情况下，中间操作不会执行");
        IntStream.of(i).map(Demo1::doubleNum);
    }

    public static int doubleNum(int i) {
        System.out.println("✖️2");
        return i * 2;
    }
}
