package com.loong.pattern.behavioal.visitor.Demo1;

/**
 * @author xiongtaolong
 * @date 2019-05-14 20:20
 */
public interface ShoppingCartVisitor {
    void visit(NetSuperItem netSuperItem);
    void visit(AgreementItem agreementItem);
}
