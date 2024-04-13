package Program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // entities.BusinessAccount acc5 = (entities.BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        System.out.println();

        Account accAlex = new Account(1001, "Alex", 1000.0);
        accAlex.withdraw(200.0);
        System.out.println(accAlex.getBalance());

        Account accLeticia = new SavingsAccount(1001, "Leticia",1000.0, 0.01);
        accLeticia.withdraw(200.0);

        System.out.println("---------------------Polimorfismo------------------------------");
        Account poli1 = new Account(1021, "Poli", 1000.0);
        Account poli2 = new SavingsAccount(1022, "Poli", 1000.0, 0.01);

        poli1.withdraw(50.0);
        poli2.withdraw(50.0);
        System.out.println(poli1.getBalance());
        System.out.println(poli2.getBalance());

    }
}