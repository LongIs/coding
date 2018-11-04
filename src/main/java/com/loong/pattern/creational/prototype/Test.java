package com.loong.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        List<Mail> list = new ArrayList<Mail>();
        for (int i = 0; i < 10; i++) {
            mail = (Mail) mail.clone();
            mail.setName("张三"+i);
            mail.setEmailAddress("江西"+i);
            mail.setContent("无视"+i);
            list.add(mail);
        }
        System.out.println(list);
    }
}
