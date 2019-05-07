package com.loong.pattern.behavioal.strategy.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:49
 */
public class MultiBrand implements RequireTypeOperation {
    @Override
    public void Operation() {
        System.out.println("批量中的多品牌打包，选购多个商品，打包，供应商报价");
    }
}
