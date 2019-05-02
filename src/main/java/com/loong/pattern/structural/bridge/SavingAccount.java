package com.loong.pattern.structural.bridge;

public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是个活期账户");
    }
}
