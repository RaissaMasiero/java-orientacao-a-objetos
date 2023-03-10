package entities;
public class Rectangle {

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
