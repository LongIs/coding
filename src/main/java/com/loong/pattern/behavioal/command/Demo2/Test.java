package com.loong.pattern.behavioal.command.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-10 16:45
 */
public class Test {
    public static void main(String[] args) {
        Light light = new Light();

        LightShutCommand lightShutCommand = new LightShutCommand(light);
        LightOpenCommand lightOpenCommand = new LightOpenCommand(light);

        Invoke invoke = new Invoke();
        invoke.setCommand(lightOpenCommand);
        invoke.doAction();

        invoke.setCommand(lightShutCommand);
        invoke.doAction();

    }
}
