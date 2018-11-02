package com.loong.pattern.creational.singleton.sing2;

/**
 * @description:
 * @author: TaoLong
 * @create: 2018/10/31 21:00
 **/
public class LazyDoubleCheckSingleton {


    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getLazyDoubleCheckSingleton(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
