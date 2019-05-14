package com.loong.pattern.behavioal.chain;

/**
 * @author xiongtaolong
 * @date 2019-05-14 17:02
 */
public class GuangZhou implements Handler {

    Handler handler;

    Integer i = 2;

    @Override
    public void handlerRequest(Integer number) {
        if(!i.equals(number)){
            System.out.println("不是广州");
            handler.handlerRequest(number);
        }else{
            System.out.println("是广州");
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
