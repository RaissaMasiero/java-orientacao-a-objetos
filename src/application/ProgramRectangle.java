package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Digite a largura e altura do retângulo: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        double a = rectangle.area();
        System.out.printf("AREA: %.2f%n", a);

        double p = rectangle.perimeter();
        System.out.printf("PERIMETER: %.2f%n", p);

        double d = rectangle.diagonal();
        System.out.printf("DIAGONAL: %.2f%n", d);

        sc.close();
    }
}
