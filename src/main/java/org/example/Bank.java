package org.example;

import java.util.logging.Logger;

public class Bank {
    Logger logger = Logger.getLogger("bank");
    public boolean transfer(Account src,Account dest,float amount){
        try{
            src.withdraw(amount);
        }catch(IllegalArgumentException e){
            logger.severe(e.getMessage());
        }dest.deposit(amount);
        return true;
    }
}
