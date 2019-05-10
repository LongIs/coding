package com.loong.pattern.behavioal.command.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-10 16:40
 * 接收类／处理类
 */
public class Light {
    public void shut(){
        System.out.println("关灯。");
    }

    public void open(){
        System.out.println("开灯");
    }
}
