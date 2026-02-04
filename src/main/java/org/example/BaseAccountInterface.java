package org.example;

public interface BaseAccountInterface {
    public int getNumber();
    public void setType(ACCOUNT_TYPE type);
    public ACCOUNT_TYPE getType();
    public float getBalance();
    public void setBalance(float balance);
    public abstract float deposit (float amount);
    public abstract float withdraw(float amount);
}