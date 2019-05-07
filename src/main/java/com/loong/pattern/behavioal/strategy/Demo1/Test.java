package com.loong.pattern.behavioal.strategy.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:21
 */
public class Test {
    public static void main(String[] args) {
        Context Context = new Context(new RunFast());
        Context.run();

        Context context1 = new Context(new Jogging());
        context1.run();
    }
}
