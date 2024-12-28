package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING (subclasse para superclasse)
        Account acc1 = bacc; //obj da subclasse sendo atribuido a um objeto da superclasse
        //como BusinessAccount ou SavingsAccount são Account também, é possível fazer isso
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING (superclasse para subclasse)
        BusinessAccount acc4 = (BusinessAccount)acc2; //forçando conversão de superclasse (Account)
        // para subclasse (BusinessAccount). acc2 é inicialmente Account, mas converte-se para
        // BusinessAccount

        //BusinessAccount acc5 = (BusinessAccount)acc3; NÃO POSSO FAZER ISSO, POIS acc3 É SavingsAccount
        if (acc3 instanceof BusinessAccount){ //se acc3 realmente for BusinessAccount...
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){ //se acc3 for SavingsAccount...
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}