package application;

import entities.Account;
import entities.CompanyAccount;
import entities.IndividualAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Account> accounts = new ArrayList<Account>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                accounts.add(new IndividualAccount(name, annualIncome, healthExpenditures));
            }
            else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int numOfEmployees = sc.nextInt();

                accounts.add(new CompanyAccount(name, annualIncome, numOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Account account : accounts) {
            System.out.println(account);
            double tax = account.tax();
            sum += tax;
        }

        System.out.println();
        System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}