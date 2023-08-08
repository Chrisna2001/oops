abstract class Shape {
    // Abstract method
    abstract double calculateArea();
    
    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class that extends the abstract class
class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class that extends the abstract class
class Rectangle extends Shape {
    double width;
    double height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    double calculateArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        circle.display();
        System.out.println("Circle area: " + circle.calculateArea());
        
        rectangle.display();
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}