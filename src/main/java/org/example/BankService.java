package org.example;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class BankService {
Map<String,Account>accountSet=new HashMap<>();
    public BankService(){}

   /* public BankService(Map<String, Account> accountSet) {
        this.accountSet = accountSet;
    }*/

    public Map<String, Account> getAccountSet() {
        return accountSet;
    }

    public void setAccountSet(Map<String, Account> accountSet) {
        this.accountSet = accountSet;
    }

    @Override
    public String toString() {
        for (Map.Entry<String, Account> entry : accountSet.entrySet()) {
            System.out.println("AccountNumber: " + entry.getKey() + ", Account: " + entry.getValue());
        }
        return "BankService{" +
                "accountSet=" + accountSet +
                '}';
    }

    //Implement a method in BankService to open an account.
    //It should only require a customer as an argument and should
    // return the new account number.
    public void openAccount(List<Client> client){
        Account newAccount= new Account(BigDecimal.ZERO,client);
        this.accountSet.put(newAccount.getAccountNumber(),newAccount);

    }
    //Implement a method in BankService to transfer a specific amount
    // (as BigDecimal) from one account number (as String) to another
    // account number (as String).
    public void moneyTransfer(BigDecimal amount,String fromAccount,String toAccount){
        Account accountFrom=this.accountSet.get(fromAccount);
        accountFrom.withdrawMoney(amount);
        Account accountTo=this.accountSet.get(toAccount);
        accountTo.depositMoney(amount);


    }
    /*
    **Write a method public List<String> split(String accountNumber) in the service
    *  that splits an account equally. From a joint account, individual accounts
    * should be created for each account holder. It should return the newly created
    *  account numbers. Each account should receive the same amount of money after
    *  the split (+- 1 cent). Make sure that the bank does not incur any cent gains
    *  or losses during the process.
     */
    public void split(String accountNumber) {
        Account account = this.accountSet.get(accountNumber);
        List<Client> clients = account.getCustomer();
        int splitIn = clients.size();

        if (splitIn > 1) {
            BigDecimal bigSplit = new BigDecimal(splitIn);
            //first delete account from the list and then create new accounts
            this.accountSet.remove(accountNumber);
            BigDecimal splitAmount = account.getAccountBalance().divide(bigSplit);
            for (Client client : clients) {
                List<Client> clients1 = Collections.singletonList(client);
                Account splitAccount = new Account(splitAmount, clients1);
                this.accountSet.put(splitAccount.getAccountNumber(), splitAccount);

            }
        }
    }
}
