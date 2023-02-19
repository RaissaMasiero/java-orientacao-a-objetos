package exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {

        /* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule
        e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for(int i=0; i<n; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i+1);
            generos[i] = sc.next().charAt(0);
        }

        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];

        for(int i=0; i<n; i++){
            if(alturas[i] > maiorAltura){
               maiorAltura = alturas[i];
            }else if(alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }
        }

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);

        int qtdHomens = 0;
        int qtdMulheres = 0;
        double somaAlturaFeminina = 0;

        for(int i=0; i<n; i++){
            if(generos[i] == 'M'){
               qtdHomens++;
            }else{
               qtdMulheres++;
               somaAlturaFeminina += alturas[i];
            }
        }

        double mediaAlturaFeminina = somaAlturaFeminina / qtdMulheres;

        System.out.printf("Média das alturas das mulheres: %.2f \n", mediaAlturaFeminina);
        System.out.println("Número de homens: " + qtdHomens);

        sc.close();
    }
}
