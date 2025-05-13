public class Sphere extends Circle{
    
    public Sphere(double radius) {
        super(radius);
    }

    public double area() {
        return 4.0 * Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * radius * 4.0/3.0;
    }
}
