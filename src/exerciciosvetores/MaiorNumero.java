package exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        /* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior
        número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira
        posição como 0 (zero). */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for(int i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double maiorNumero = 0;
        int posicao = 0;

        for(int i=0; i<vetor.length; i++){
            if(vetor[i] > maiorNumero){
               maiorNumero = vetor[i];
               posicao = i;
            }
        }

        System.out.println("MAIOR VALOR: " + maiorNumero + " | POSIÇÃO DO MAIOR VALOR: " + posicao);

        sc.close();
    }
}
