package cn.loong.pattern.structural.adapter.classadapter;

/**
 * @author xiongtaolong
 * @date 2019-04-30 14:20
 */
public class Test {
    public static void main(String[] args) {
        CatchingShadows catchingShadows = new CatchingShadowsImpl();
        catchingShadows.NothingnessDisaster();

        CatchingShadows catchingShadows1 = new Adapter();
        catchingShadows1.NothingnessDisaster();
    }
}
