package com.loong.pattern.behavioal.observer;

/**
 * @author xiongtaolong
 * @date 2019-05-09 19:59
 */
public class Test {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("张三");
        Subscriber subscriber2 = new Subscriber("李四");
        Subscriber subscriber3 = new Subscriber("王五");

        SubscriptionNumber subscriptionNumber = new SubscriptionNumber();
        subscriptionNumber.addObserver(subscriber1);
        subscriptionNumber.addObserver(subscriber2);
        subscriptionNumber.addObserver(subscriber3);

        subscriptionNumber.submit("发布音频");

    }
}
