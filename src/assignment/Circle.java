package assignment;

public class Circle {

    private final double radius;
    private final double diameter;

    private Circle(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public static Circle withRadius(double radius) {
        return new Circle(radius);
    }

    public static Circle withDiameter(double diameter) {
        return new Circle(diameter / 2);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(Circle.withRadius(20.0).area());
        System.out.println(Circle.withDiameter(40.0).area());
    }
}
