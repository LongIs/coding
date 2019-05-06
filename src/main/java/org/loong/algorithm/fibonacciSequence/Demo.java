package org.loong.algorithm.fibonacciSequence;

/**
 * @author xiongtaolong
 * @date 2019-05-06 19:09
 * 斐波那契数列的定义：它的第一项和第二项均为1，以后各项都为前两项之和
 * 1 1 2 3 5 8 13 21 34 55
 */
public class Demo {
    public static void main(String[] args) {
        int x = 1; int y = 1;
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < 13; i++){
            if(i % 2 == 1){
                x = x + y;
                System.out.println(x);
            }else{
                y = x + y;
                System.out.println(y);
            }
        }
    }
}
