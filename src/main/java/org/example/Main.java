package org.example;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Vorname1","Nachname","1");
        Client client2 = new Client ("Vorname2","Nachname","2");
        Client client3 = new Client("Vorname3","Nachname","3");
        Client client4 = new Client("Vorname4","Nachname","4");
        Client client5 = new Client("Vorname5","Nachname","5");
       /* Account account1 = new Account(BigDecimal.ZERO,client1);
        Account account2 = new Account(BigDecimal.ZERO,client2);
        Account account3 = new Account(BigDecimal.ZERO,client3);
        Account account4 = new Account(BigDecimal.ZERO,client4);
        Account account5 = new Account(BigDecimal.ZERO,client5);*/
        List<Client>listClient1= Collections.singletonList(client1);
        List<Client>listClient2= Collections.singletonList(client2);
        List<Client>listClient3= Collections.singletonList(client3);
        List<Client>listClient4= Collections.singletonList(client4);
        List<Client>listClient5= Collections.singletonList(client5);
        List<Client>listwithmoreClients=new ArrayList<>();
        listwithmoreClients.add(client1);
        listwithmoreClients.add(client2);
        BankService bankSet= new BankService();
        bankSet.openAccount(listClient1);
        bankSet.openAccount(listClient2);
        bankSet.openAccount(listClient3);
        bankSet.openAccount(listClient4);
        bankSet.openAccount(listClient5);
        bankSet.openAccount(listwithmoreClients);
        System.out.println(bankSet.toString());
        //bankSet.split("1699887779009");
        System.out.println(bankSet.toString());





    }
}