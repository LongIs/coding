package com.loong.pattern.behavioal.strategy.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:42
 */
public class SingleBrand implements RequireTypeOperation {
    @Override
    public void Operation() {
        System.out.println("批量中单品牌打包，只能选购一种商品，之后打包，商家报价。。");
    }
}
