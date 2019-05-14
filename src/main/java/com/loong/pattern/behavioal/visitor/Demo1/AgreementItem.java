package com.loong.pattern.behavioal.visitor.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-14 20:13
 */
public class AgreementItem implements Item {

    private int price = 18;
    private String desc = "协议商品计算价格，";

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public void accept(ShoppingCartVisitor shoppingCartVisitor) {
        shoppingCartVisitor.visit(this);
    }
}
