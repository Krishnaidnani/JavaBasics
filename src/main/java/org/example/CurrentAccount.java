package org.example;

public class CurrentAccount extends Account{
    public CurrentAccount(int number) {
        super(number);
    }

    @Override
    public float deposit(Account account,float amount) {
        return account.getBalance()+amount;
    }
}