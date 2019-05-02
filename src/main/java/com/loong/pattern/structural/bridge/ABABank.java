package com.loong.pattern.structural.bridge;

public class ABABank extends Bank {
    public ABABank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开农业银行账户");
        return this.account.openAccount();
    }
}
