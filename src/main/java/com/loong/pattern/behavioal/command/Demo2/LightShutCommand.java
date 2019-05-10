package com.loong.pattern.behavioal.command.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-10 16:41
 * 具体命令类，执行关灯命令
 */
public class LightShutCommand extends Command{

    Light light;

    public LightShutCommand(Light light){
        this.light = light;
    }

    @Override
    void execute() {
        light.shut();
    }
}
