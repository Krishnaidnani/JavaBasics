package org.example;

public class SavingAccount extends Account{

    public SavingAccount(int i) {
        super(i);
    }

    @Override
    public float deposit(float amount) {
        this.setBalance(this.getBalance() + amount);
        return this.getBalance();
    }

    public float withdraw(float amount){
        if(amount <= this.getBalance() && amount > 0) {
            this.setBalance(this.getBalance() - amount);
        }else{
            throw new IllegalArgumentException("amount is more than balance");
        }
        System.out.println("Withdraw: "+ this.getBalance());
        return this.getBalance();
    }

}