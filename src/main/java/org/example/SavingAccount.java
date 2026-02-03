package org.example;

public class SavingAccount extends Account{

    public SavingAccount(int i) {
        super(i);
    }

    @Override
    public float deposit(Account account, float amount) {
        account.setBalance(account.getBalance() + amount);
        return account.getBalance();
    }

}