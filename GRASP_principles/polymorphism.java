// Shape abstract class
abstract class Shape {
    public abstract void draw();
}
// Circle class
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
// Main class to demonstrate polymorphism
public class polymorphism {
    public static void main(String[] args) {
        // Create an array of Shape references
        Shape[] shapes = new Shape[3];
        
        // Instantiate concrete Shape objects
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        
        // Iterate through the shapes array and draw each shape
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

