package com.loong.pattern.behavioal.chain;

/**
 * @author xiongtaolong
 * @date 2019-05-14 17:02
 */
public class BeiJin implements Handler{

    Handler handler;

    Integer i = 1;

    @Override
    public void handlerRequest(Integer number) {
        if(!i.equals(number)){
            System.out.println("不是北京");
            handler.handlerRequest(number);
        }else{
            System.out.println("是北京");
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
