package com.loong.pattern.behavioal.visitor.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-14 21:02
 * 账单查看者
 */
public interface AccountBookViewer {

    /**
     * 查看消费账单
     * @param consumeBill
     */
    void view(ConsumeBill consumeBill);

    /**
     * 查看收入账单
     * @param incomeBill
     */
    void view(IncomeBill incomeBill);

}
