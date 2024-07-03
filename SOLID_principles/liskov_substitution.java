package SOLID_principles;


// Shape class
abstract class Shape {
    public abstract double calculateArea();
}
// Rectangle class
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
// Square class
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}
// Main class to test Liskov Substitution Principle
public class liskov_substitution {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(4);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}
