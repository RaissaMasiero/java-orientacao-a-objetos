package exerciciosvetores;

import entities.Rent;

import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {

        /*A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos
        números 0 a 9. Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N
        representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel
        dos N estudantes. Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele
        escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de
        todas ocupações do pensionato, por ordem de quarto.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados: ");
        int n = sc.nextInt();

        Rent[] vetor = new Rent[10];

        for(int i=1; i<=n; i++){
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numero = sc.nextInt();
            vetor[numero] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");

        for(int i=0; i<10; i++){
            if(vetor[i] != null){
               System.out.println(i + ": " + vetor[i]);
            }
        }

        sc.close();
    }
}
