package org.loong.lambda.Chapter1;

import java.text.DecimalFormat;
import java.util.function.Function;

public class Demo3 {
    private final int money;

    public Demo3(int money){
        this.money = money;
    }

    /*public void printMony(IMoneyFormat iMoneyFormat){
        System.out.println("我的存款："+iMoneyFormat.format(this.money));
    }*/

    /**
     * Lambda表达式不关心实现了哪个接口，不需要知道接口的名字，不需要知道方法，只需要知道输入是什么，输出是什么
     * 这里是输入是Integer，输出是String
     */
    public void printMony(Function<Integer,String> iMoneyFormat){
        System.out.println("我的存款："+iMoneyFormat.apply(this.money));
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3(99999);

        //demo3.printMony(i -> new DecimalFormat("#,###").format(i));

        Function<Integer,String> iMoneyFormat = i -> new DecimalFormat("#,###").format(i);
        demo3.printMony(iMoneyFormat.andThen(s -> "人命币" + s));
    }
}
/*
interface IMoneyFormat{
    String format(int i);
}*/
