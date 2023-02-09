package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {
    public static void main(String[] args) {

        /*
            Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
            válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
            possui a maior área. (fórmula de heron)
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Área maior: X");
        }else{
            System.out.println("Área maior: Y");
        }

        sc.close();
    }
}
