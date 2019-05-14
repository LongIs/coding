package com.loong.pattern.behavioal.visitor.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-14 20:59
 * 消费账单
 */
public class ConsumeBill implements Bill{
    private double amount;

    private String item;

    public ConsumeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accep(AccountBookViewer accountBookViewer) {
        accountBookViewer.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
