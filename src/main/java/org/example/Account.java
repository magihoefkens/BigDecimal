package org.example;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    BigDecimal accountBalance;
    public Client customer;

    public Account(String accountNumber, BigDecimal accountBalance, Client customer) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }
}
