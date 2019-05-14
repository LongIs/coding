package com.loong.pattern.behavioal.visitor.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-14 20:11
 */
public interface Item {
    void accept(ShoppingCartVisitor shoppingCartVisitor);
}
