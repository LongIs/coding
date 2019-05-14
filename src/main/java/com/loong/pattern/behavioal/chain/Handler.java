package com.loong.pattern.behavioal.chain;

/**
 * @author xiongtaolong
 * @date 2019-05-14 15:52
 */
public interface Handler {

    void handlerRequest(Integer number);

    void setNextHandler(Handler handler);
}
