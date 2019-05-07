package com.loong.pattern.behavioal.strategy.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:45
 */
public class DirectOrder implements RequireTypeOperation {
    @Override
    public void Operation() {
        System.out.println("直接订购，不打包也不报价，后台发起只能选购一种商品，前台购物车可选购多种商品");
    }
}
