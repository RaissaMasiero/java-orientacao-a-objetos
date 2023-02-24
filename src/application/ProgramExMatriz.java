package application;

import java.util.Scanner;
public class ProgramExMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // tamanho da matriz. Nesse caso, 3 por 3.
        int [][] mat = new int[n][n];

        for(int i=0; i< mat.length; i++){ // linhas
            for(int j=0; j<mat[i].length; j++){ // colunas
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");

        for(int i=0; i< mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        int count = 0;

        for(int i=0; i<mat.length; i++){ // linhas
            for(int j=0; j<mat[i].length; j++){ // colunas
                if(mat[i][j] < 0){
                   count++;
                }
            }
        }

        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}
