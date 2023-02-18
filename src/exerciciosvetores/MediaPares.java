package exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {

        /* Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a
        mensagem "NENHUM NUMERO PAR"*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos tem o vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        double soma = 0;
        int pares = 0;

        for(int i=0; i<vetor.length; i++){
            if(vetor[i] % 2 == 0){
               soma += vetor[i];
               pares++;
            }
        }

        if(pares == 0){
           System.out.println("NENHUM NÚMERO PAR");
        }else{
           double media = soma / pares;
            System.out.printf("MÉDIA DOS PARES: %.1f%n", media);
        }

        sc.close();
    }
}
