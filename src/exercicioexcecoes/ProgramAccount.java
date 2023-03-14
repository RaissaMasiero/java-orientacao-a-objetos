package exercicioexcecoes;

import exception.ValueException;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("**** DADOS DA CONTA ****");
            System.out.print("Número: ");
            int numeroConta = sc.nextInt();

            System.out.print("Titular: ");
            sc.nextLine();
            String titular = sc.nextLine();

            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();

            System.out.print("Limite de saque: ");
            double limiteSaque = sc.nextDouble();

            Account conta = new Account(numeroConta, titular, saldo, limiteSaque);

            System.out.println();
            System.out.print("Quantia para saque: ");
            double valor = sc.nextDouble();

            conta.saque(valor);
            System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));

        } catch (ValueException e) {
            System.out.println("Erro de saque: " + e.getMessage());

        } catch (RuntimeException e){
            System.out.println("Erro inesperado!");
        }

        sc.close();
    }
}
