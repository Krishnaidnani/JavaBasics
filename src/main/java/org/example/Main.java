package org.example;

import org.example.ACCOUNT_TYPE;
import org.example.Account;
import org.example.CurrentAccount;
import org.example.SavingAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account account=new SavingAccount(123);
        Account account1=new SavingAccount(000);
        Account account2=new SavingAccount(111);
        Address account1Address=new Address("12A", "MG Road", "Bangalore", "India", 560001);

        account1.deposit(2000);
        account2.deposit(3000);

        System.out.println(account.getNumber());

        Account current = new CurrentAccount(999);
        Bank sendAmmount = new Bank();

        sendAmmount.transfer(account1,account2,100);
        System.out.println(account1.getBalance());
        System.out.println(account1Address);
    }
}