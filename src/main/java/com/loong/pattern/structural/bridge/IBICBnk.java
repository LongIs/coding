package com.loong.pattern.structural.bridge;

public class IBICBnk extends Bank {
    public IBICBnk(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开工商银行账户");
        return this.account.openAccount();
    }
}
