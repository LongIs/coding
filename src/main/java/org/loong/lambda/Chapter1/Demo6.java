package org.loong.lambda.Chapter1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo6 {
    public static void main(String[] args) {
        ADemo6 aDemo6 = (x, y) -> x + y;
        System.out.println(aDemo6.add(1, 2));

        List<String> list = Arrays.asList("zhan", "san", "li", "s");
        Collections.sort(list, (e1, e2) -> e1.length() - e2.length() );
        // 另一种写法
        Collections.sort(list, Comparator.comparingInt(String::length));
    }
}
interface ADemo6 {
    int add (int x, int y);
}