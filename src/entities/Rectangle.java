package entities;
public class Rectangle {

    /*
        Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar
        na tela o valor de sua área, perímetro e diagonal.
     */

    public double width; // width = largura
    public double height; // height = altura

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2.0 * (width + height);
    }
    public double diagonal(){
        return Math.sqrt((width * width) + (height * height));
    }
}
