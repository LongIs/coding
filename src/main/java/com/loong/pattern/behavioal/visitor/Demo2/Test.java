package com.loong.pattern.behavioal.visitor.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-14 21:09
 */
public class Test {
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        //添加两条收入
        accountBook.add(new IncomeBill(10000, "卖商品"));
        accountBook.add(new IncomeBill(12000, "卖广告位"));
        //添加两条支出
        accountBook.add(new ConsumeBill(1000, "工资"));
        accountBook.add(new ConsumeBill(2000, "材料费"));

        AccountBookViewer boss = new Boss();
        AccountBookViewer cpa = new CPA();

        accountBook.show(boss);
        accountBook.show(cpa);

        ((Boss) boss).getTotalConsume();
        ((Boss) boss).getTotalIncome();

    }
}
