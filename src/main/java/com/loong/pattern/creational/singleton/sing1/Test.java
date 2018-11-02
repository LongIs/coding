package com.loong.pattern.creational.singleton.sing1;

/**
 * @description:
 * @author: TaoLong
 * @create: 2018/10/31 20:55
 **/
public class Test {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getLazySingleton();
        LazySingleton lazySingleton2 = LazySingleton.getLazySingleton();
        
        System.out.println(lazySingleton1 == lazySingleton2);
    }
}
