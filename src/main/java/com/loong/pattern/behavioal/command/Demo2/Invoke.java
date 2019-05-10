package com.loong.pattern.behavioal.command.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-10 16:44
 * 调用类
 */
public class Invoke {

    Command command;

    public Invoke(){
    }

    public void setCommand(Command command){
        this.command = command;
    }


    public void doAction(){
        command.execute();
    }
}
