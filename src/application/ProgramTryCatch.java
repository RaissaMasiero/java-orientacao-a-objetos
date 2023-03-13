package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTryCatch {

    public static void main(String[] args) {

        // demonstração de tratamento de exceções

        method1();

        System.out.println("Fim");

    }

    public static void method1(){
        System.out.println("***METHOD 1 COMEÇO***");
        method2();
        System.out.println("***METHOD 1 FIM***");
    }

    public static void method2(){
        System.out.println("***METHOD 2 COMEÇO***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida!");
        }catch (InputMismatchException e){
            System.out.println("Input error");
        }

        sc.close();
        System.out.println("***METHOD 2 FIM***");
    }
}
