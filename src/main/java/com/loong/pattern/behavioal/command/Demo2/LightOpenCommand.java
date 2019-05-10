package com.loong.pattern.behavioal.command.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-10 16:42
 * 具体命令类，执行开灯命令
 */
public class LightOpenCommand extends Command{

    Light light;

    public LightOpenCommand(Light light){
        this.light = light;
    }

    @Override
    void execute() {
        light.open();
    }
}
