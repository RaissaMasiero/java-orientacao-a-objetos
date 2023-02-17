package exerciciosvetores;

import java.util.Scanner;

public class NumerosNegativos {

    public static void main(String[] args) {

        /* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar: ");
        int numero = sc.nextInt();

        int[] numerosInteiros = new int[numero];

        for(int i=0; i<numerosInteiros.length; i++){
            System.out.print("Digite um número: ");
            numerosInteiros[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for(int i=0; i<numerosInteiros.length; i++){
            if (numerosInteiros[i] < 0) {
                System.out.println(numerosInteiros[i]);
            }
        }

        sc.close();
    }
}
