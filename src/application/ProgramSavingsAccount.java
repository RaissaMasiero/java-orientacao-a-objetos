package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ProgramSavingsAccount {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Raissa", 0.0);
        BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.0);

        // upcasting: atribuindo objetos de subclasse a um objeto de superclasse

        Account acc1 = bacc;
        Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // downcasting: atribuindo objetos da superclasse a um objeto de subclasse

        BusinessAcount bacc1 = (BusinessAcount) acc2;
        bacc1.emprestimo(100.0);

        if(acc3 instanceof BusinessAcount){ // testa se acc3 é do tipo BusinessAcount
           BusinessAcount bacc2 = (BusinessAcount) acc3; // tenta cast(conversão) acc3 para BusinessAcount
           bacc2.emprestimo(200.0);
           System.out.println("Empréstimo");
        }

        if(acc3 instanceof SavingsAccount){
           SavingsAccount sacc = (SavingsAccount) acc3;
           sacc.atualizarTaxa();
           System.out.println("Atualizado");
        }

        System.out.println("-----------------------------------------");

        // testando sobreposição de métodos

        Account acc4 = new Account(1005, "Mário", 1000.0);
        acc4.saque(200.0);
        System.out.println(acc4.getSaldo());

        Account acc5 = new SavingsAccount(1006, "Bernardo", 1000.0, 0.01);
        acc5.saque(200.0);
        System.out.println(acc5.getSaldo());

        Account acc6 = new BusinessAcount(1007, "Catarina", 1000.0, 500.0);
        acc6.saque(200.0);
        System.out.println(acc6.getSaldo());

        System.out.println("-----------------------------------------");

        // testando polimorfismo: variáveis do mesmo tipo com comportamentos diferentes

        Account x = new Account(1020, "Rayane", 1000.0);
        Account y = new SavingsAccount(1023, "Marian", 1000.0, 0.01);

        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());

        System.out.println("-----------------------------------------");

        // totalizar o saldo de todas as contas e depositar em todas as contas

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1010, "Alex", 500.00, 0.01));
        list.add(new BusinessAcount(1009, "Maria", 1000.00, 400.00));
        list.add(new SavingsAccount(1008, "Bob", 300.0, 0.01));
        list.add(new BusinessAcount(1011, "Ana", 500.0, 500.0));

        double sum = 0.0;
        for(Account a : list){
            sum += a.getSaldo();
        }

        System.out.printf("Saldo de contas: %.2f%n", sum);

        System.out.println("-----------------------------------------");

        for(Account a : list){
            a.deposito(10.0);
        }

        for(Account a : list){
            System.out.printf("Saldo atualizado para conta %d: %.2f%n", a.getNumeroConta(), a.getSaldo());
        }
    }
}
