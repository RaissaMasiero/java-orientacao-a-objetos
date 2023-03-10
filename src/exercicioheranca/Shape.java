package exercicioheranca;

import entities.enums.Color;
abstract public class Shape {

    private Color color;
    public Shape(){}
    public Shape(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    abstract public double area();
}
