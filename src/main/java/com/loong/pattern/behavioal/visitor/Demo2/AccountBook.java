package com.loong.pattern.behavioal.visitor.Demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiongtaolong
 * @date 2019-05-14 21:12
 * 账本 里面存放账单
 */
public class AccountBook {

    List<Bill> list = new ArrayList<>();

    public void add(Bill bill){
        list.add(bill);
    }

    public void show(AccountBookViewer viewer){
        for (Bill bill: list) {
            bill.accep(viewer);
        }
    }

}
