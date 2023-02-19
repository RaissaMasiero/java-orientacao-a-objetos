package exerciciosvetores;

import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {

        /* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa
        mais velha.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas: ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for(int i=0; i<n; i++){
            System.out.printf("Dados da %da pessoa \n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int idadeAtual = 0;
        String maisVelho = "";

        for(int i=0; i<n; i++){
            if(idades[i] > idadeAtual){
               idadeAtual = idades[i];
               maisVelho = nomes[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + maisVelho);

        sc.close();
    }
}
