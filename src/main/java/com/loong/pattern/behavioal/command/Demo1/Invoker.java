package com.loong.pattern.behavioal.command.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-10 16:24
 */
public class Invoker {

    Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void doAction(){
        command.execute();
    }

}
