package com.loong.pattern.structural.bridge;

public abstract class Bank {
    Account account;

    public Bank(Account account){
        this.account = account;
    }

    abstract Account openAccount();
}
