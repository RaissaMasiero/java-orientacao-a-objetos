package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

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
    }
}
