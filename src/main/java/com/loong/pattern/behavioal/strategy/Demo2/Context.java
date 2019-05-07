package com.loong.pattern.behavioal.strategy.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:51
 */
public class Context {

    RequireTypeOperation requireTypeOperation;

    public Context(){

    }

    public Context(RequireTypeOperation requireTypeOperation){
        this.requireTypeOperation = requireTypeOperation;
    }

    public void croRequireType(int type){
        requireTypeOperation = RequireTypeFactory.getFactory().getRequireType(type);
        requireTypeOperation.Operation();
    }

}
