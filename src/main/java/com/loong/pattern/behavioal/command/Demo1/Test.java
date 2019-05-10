package com.loong.pattern.behavioal.command.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-10 16:27
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        CommandImpl command = new CommandImpl(receiver);

        Invoker invoker = new Invoker(command);
        invoker.doAction();
    }
}
