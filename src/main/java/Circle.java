public class Circle {
    
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double diameter() {
        return 2.0 * this.radius;
    }

    public double perimeter() {
        return 2.0 * Math.PI * this.radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
 }