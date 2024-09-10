abstract class shape{
    abstract double area();
}

class rect extends shape{
    int length ; 
    int breadth;
    rect(int l, int b){
        this.length = l ; 
        this.breadth = b ;
    }
    @Override
    double area() {
        return length*breadth;
    }
}

class circle extends shape{
    int radius;
    circle(int r ){
        this.radius=r;
    }
    @Override
    double area(){
        return 3.14*radius*radius;
    }
}

public class question3 {
    public static void main(String[] args) {
        shape rect = new rect(5, 3);
        shape circ = new circle(4);

        System.out.println("Area of rectangle: " + rect.area());
        System.out.println("Area of circle: " + circ.area());
    }
}

