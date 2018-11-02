package com.loong.pattern.creational.singleton.sing1;

/**
 * @description:
 * @author: TaoLong
 * @create: 2018/10/31 20:52
 **/
public class LazySingleton {


    private LazySingleton(){

    }


    private static LazySingleton lazySingleton = null;

    public static LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
