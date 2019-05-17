package org.loong.lambda.Chapter1;

public class Demo2 {
    public static void main(String[] args) {
        ADemo2 x1 = i -> i*1;
        System.out.println(x1.add(2));

        ADemo2 x2 = (i) -> i*2;
        System.out.println(x2.add(2));

        ADemo2 x3 = (int i) -> i*3;
        System.out.println(x3.add(2));

        ADemo2 x4 = (i) -> {
            return i*4;
        };
        System.out.println(x4.add(2));

        int add = x4.add(1, 2);
        System.out.println(add);

    }
}
@FunctionalInterface //此注解表示这个接口是一个函数接口，只能有一个方法
interface ADemo2{
    int add(int i);

    /** Java8后的新特性， 实现此接口的类不用重写此方法。List接口案例*/
    default int add(int i , int b){
        return i*b;
    }
}
