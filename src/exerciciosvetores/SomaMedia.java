package exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaMedia {

    public static void main(String[] args) {

        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a média dos elementos do vetor */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for(int i=0; i< numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }

        double soma = 0.0;
        System.out.println("VALORES = ");

        for(int i=0; i< numeros.length; i++){
            System.out.println(numeros[i]);
            soma += numeros[i];
        }

        System.out.printf("SOMA: %.2f%n", soma);

        double media = soma / n;
        System.out.printf("MÉDIA: %.2f%n", media);

        sc.close();
    }
}
