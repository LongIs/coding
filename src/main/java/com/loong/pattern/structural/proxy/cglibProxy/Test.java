package com.loong.pattern.structural.proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author xiongtaolong
 * @date 2019-05-05 17:27
 *
 * CGLIB通过继承的方式进行代理，无论目标对象有没有实现接口都可以代理，但是无法处理final的情况
 */
public class Test {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloConcrete.class);
        enhancer.setCallback(new MyMethodInterceptor());

        HelloConcrete hello = (HelloConcrete)enhancer.create();
        System.out.println(hello.sayHello("I love you!"));
    }
}
