package exerciciosvetores;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {

        /* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos
        os números pares, e também a quantidade de números pares. */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i=0; i< vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS PARES:");

        double qtd = 0;
        for(int i=0; i< vetor.length; i++){
            if(vetor[i] % 2 == 0){
               System.out.println(vetor[i]);
               qtd += 1;
            }
        }

        System.out.println("QUANTIDADE DE PARES: " + qtd);

        sc.close();
    }
}
