package org.loong.lambda.Chapter1;

import java.util.stream.IntStream;

public class Demo1 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,1,8,9,10};
        int asInt = IntStream.of(nums).min().getAsInt();
        System.out.println(asInt);

        new Thread(() -> System.out.println(12)).start();
        Runnable runnable = () -> System.out.println(12);

        //new A(() -> System.out.println(12));
        G g = () -> System.out.println(1);//返回的是一个函数接口
        g.a();
    }
}
interface G{
    void a();
}
class A{
    public A(G g){

    }
}
