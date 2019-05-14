package com.loong.pattern.behavioal.visitor.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-14 21:06
 * 老板类，查看账本的类之一
 * 老板只关注一共花了多少钱以及一共收入多少钱，其余并不关心
 */
public class Boss implements AccountBookViewer {

    private double totalIncome;

    private double totalConsume;

    @Override
    public void view(ConsumeBill consumeBill) {
        totalConsume += consumeBill.getAmount();
    }

    @Override
    public void view(IncomeBill incomeBill) {
        totalIncome += incomeBill.getAmount();
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }

}
