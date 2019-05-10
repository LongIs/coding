package com.loong.pattern.behavioal.command.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-10 16:23
 */
public class CommandImpl extends Command {

    Receiver receiver;

    public CommandImpl(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    void execute() {
        receiver.doCommand();
    }
}
