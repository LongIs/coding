package com.loong.pattern.behavioal.chain;

/**
 * @author xiongtaolong
 * @date 2019-05-14 17:05
 */
public class Application {

    private BeiJin beiJin = new BeiJin();
    private GuangZhou guangZhou = new GuangZhou();
    private ShangHai shangHai = new ShangHai();

    public Application(){
        beiJin.setNextHandler(guangZhou);
        guangZhou.setNextHandler(shangHai);
    }

    //响应用户请求
    public void reponseClient(Integer number) {
        beiJin.handlerRequest(number);
    }

}
