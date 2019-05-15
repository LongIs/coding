package com.loong.pattern.behavioal.state.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-15 20:21
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.print();
        context.setState(new StateB());
        context.print();
        context.setState(new StateC());
        context.print();
        context.setState(new StateD());
        context.print();
        context.setState(new StateE());
        context.print();
    }
}
