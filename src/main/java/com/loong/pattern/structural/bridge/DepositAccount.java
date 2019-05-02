package com.loong.pattern.structural.bridge;

public class DepositAccount implements Account {
    public Account openAccount() {
        System.out.println("打开定期账户");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是个定期账户");
    }
}
