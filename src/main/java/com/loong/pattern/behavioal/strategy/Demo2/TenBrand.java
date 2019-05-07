package com.loong.pattern.behavioal.strategy.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:47
 */
public class TenBrand implements RequireTypeOperation{
    @Override
    public void Operation() {
        System.out.println("竞价采购，不需打包，但需要报价，只能选购一种商品");
    }
}
