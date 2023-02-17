package exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

public class NomeIdadeAltura {

    public static void main(String[] args) {

        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, bem como os nomes das pessoas menores de 16 anos, caso houver.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int p = sc.nextInt();

        String[] nomes = new String[p];
        int[] idades = new int[p];
        double[] alturas = new double[p];

        for(int i=0; i<p; i++){
            System.out.printf("Dados %da pessoa \n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAltura = 0.0;
        for(int i=0; i<alturas.length; i++){
            somaAltura += alturas[i];
        }

        double mediaAltura = somaAltura / p;
        System.out.printf("Altura média: %.2f%n", mediaAltura);


        for(int i=0; i< idades.length; i++){
            if(idades[i] < 16){
               System.out.println(nomes[i]);
            }
        }

        sc.close();

    }
}
