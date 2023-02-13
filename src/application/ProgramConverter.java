package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConverter {

    public static void main(String[] args) {

        /*
            Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
            uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
            que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço do dólar: ");
        double dollarPrice = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados: ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);

        System.out.printf("Total a pagar em reaos: %.2f%n", result);

        sc.close();
    }
}
