package com.loong.pattern.behavioal.visitor.Demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiongtaolong
 * @date 2019-05-14 20:11
 */
public class Test {
    public static void main(String[] args) {
        List<Item> list = new ArrayList<>();
        list.add(new NetSuperItem());
        list.add(new AgreementItem());

        list.forEach((s) ->{
            s.accept(new ShoppingCartVisitorImp());
        });
    }
}
