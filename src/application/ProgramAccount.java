package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;
public class ProgramAccount {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Titular: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();

        System.out.print("Tem um depósito inicial (s/n): ");
        char resposta = sc.next().charAt(0);

        if(resposta == 's'){
            System.out.print("Digite um depósito inicial: ");
            double valorDeposito = sc.nextDouble();
            account = new Account(numeroConta, nomeTitular, valorDeposito);

        }else{
            account = new Account(numeroConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(account);

        System.out.println();
        System.out.print("Valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        account.deposito(valorDeposito);

        System.out.println();
        System.out.println("Dados atualizados da conta:");
        System.out.println(account);

        System.out.println();
        System.out.print("Valor para saque: ");
        double valorSaque = sc.nextDouble();
        account.saque(valorSaque);

        System.out.println();
        System.out.println("Dados atualizados da conta:");
        System.out.println(account);

        sc.close();
    }
}
