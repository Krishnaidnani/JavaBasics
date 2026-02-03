package org.example;

public class Bank {
    public void transfer(Account src,Account dest,float amount){
        if(src.getBalance()>amount){
            src.setBalance(src.getBalance()-amount);
            dest.setBalance(dest.getBalance()+amount);
        }
    }
}
