package com.loong.pattern.behavioal.visitor.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-14 20:23
 */
public class ShoppingCartVisitorImp implements ShoppingCartVisitor {
    @Override
    public void visit(NetSuperItem netSuperItem) {
        System.out.println(netSuperItem.getDesc() + ":" +netSuperItem.getPrice());
    }

    @Override
    public void visit(AgreementItem agreementItem) {
        System.out.println(agreementItem.getDesc() + ":" +agreementItem.getPrice());
    }
}
