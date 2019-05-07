package com.loong.pattern.behavioal.strategy.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:20
 */
public class Context {

    Motion motion;

    public Context(Motion motion){
        this.motion = motion;
    }

    public void run(){
        motion.run();
    }

}
