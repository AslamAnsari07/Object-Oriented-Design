/**
 * This interface represents a shape.
 */
interface Shape {
    double calculateArea();
}

/**
 * This class represents a rectangle shape.
 */
class Rectangle implements Shape {
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

/**
 * This class represents a circle shape.
 */
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * This class represents an area calculator.
 */
class AreaCalculator {
    public static double calculateTotalArea(Shape... shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

public class Open_Closed_Principle {
    public static void main(String[] args) {
        // Create shapes
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        // Calculate total area
        double totalArea = AreaCalculator.calculateTotalArea(rectangle, circle);
        System.out.println("Total area: " + totalArea);
    }
}

/**
 * This code adheres to the Open-Closed Principle (OCP) because:
 * - New shapes can be added (e.g., Triangle) without modifying existing code (e.g., AreaCalculator).
 * - The AreaCalculator class is open for extension (new shapes) but closed for modification (existing code).
 * - This promotes code reusability and maintainability, as existing code does not need to be changed to accommodate new shapes.
 */

