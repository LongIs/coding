package com.loong.pattern.behavioal.chain;

/**
 * @author xiongtaolong
 * @date 2019-05-14 17:03
 */
public class ShangHai implements Handler {

    Handler handler;

    Integer i = 3;

    @Override
    public void handlerRequest(Integer number) {
        if(!i.equals(number)){
            System.out.println("不是上海");
            handler.handlerRequest(number);
        }else{
            System.out.println("是上海");
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
