package com.loong.pattern.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Bank bank = new IBICBnk(new SavingAccount());
        Account Account = bank.openAccount();
        Account.showAccountType();

        Bank bank1 = new ABABank(new SavingAccount());
        Account account2 = bank1.openAccount();
        account2.showAccountType();

        Bank bank2 = new IBICBnk(new DepositAccount());
        Account account3 = bank2.openAccount();
        account3.showAccountType();

        Bank bank3 = new ABABank(new DepositAccount());
        Account account4 = bank3.openAccount();
        account4.showAccountType();
    }
}
