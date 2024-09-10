interface Shape {
    double area();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class question3 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape circ = new Circle(4);

        System.out.println("Area of rectangle: " + rect.area());
        System.out.println("Area of circle: " + circ.area());
    }
}
