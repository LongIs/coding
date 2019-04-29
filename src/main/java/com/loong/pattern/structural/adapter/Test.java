package com.loong.pattern.structural.adapter;

public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        System.out.println("电压为："+dc5.result5());
    }
}
