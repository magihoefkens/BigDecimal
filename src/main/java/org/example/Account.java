package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Account {
    private static final AtomicLong accountCounter = new AtomicLong(1000);
    private String accountNumber;
    BigDecimal accountBalance;
    public List<Client>  customers=new ArrayList<>();

    public Account( BigDecimal accountBalance, List<Client> customers) {
        this.accountNumber =  generateAccountNumber();
        this.accountBalance = accountBalance;
        this.customers = customers;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    //Implement a method to deposit money into the account.
    public void depositMoney(BigDecimal amount){
        BigDecimal newAmount=this.accountBalance.add(amount);
        this.accountBalance=newAmount;
    }
    //Implement a method to withdraw money from the account.
    public void withdrawMoney(BigDecimal amount){
        BigDecimal newAmount=this.accountBalance.subtract(amount);
        this.accountBalance=newAmount;
    }
    private String generateAccountNumber() {
        // Using timestamp and a counter for uniqueness
        long result=System.currentTimeMillis() + accountCounter.getAndIncrement();
        return Long.toString(result);
    }

   /* public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }*/

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Client> getCustomer() {
        return customers;
    }

    public void setCustomer(List<Client> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customers=" + customers +
                '}';
    }
}
