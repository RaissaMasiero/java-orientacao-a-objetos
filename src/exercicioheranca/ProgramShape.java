package exercicioheranca;

import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramShape {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Número de formas: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Dados da forma #" + i);
            System.out.print("Retângulo ou círculo (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r'){
               System.out.print("Largura: ");
               double largura = sc.nextDouble();
               System.out.print("Altura: ");
               double altura = sc.nextDouble();
               list.add(new Rectangle(color, largura, altura));
            }else{
               System.out.print("Raio: ");
               double raio = sc.nextDouble();
               list.add(new Circle(color, raio));
            }
        }

        System.out.println();
        System.out.println("ÁREAS DAS FORMAS:");

        for(Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
