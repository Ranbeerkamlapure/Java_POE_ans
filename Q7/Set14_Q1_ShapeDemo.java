abstract class Shape {
    abstract double calculatePerimeter();
}

class Square extends Shape {
    double side = 4;

    double calculatePerimeter() {
        return 4 * side;
    }
}

class Circle extends Shape {
    double radius = 3;

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Set14_Q1_ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Square();
        Shape s2 = new Circle();

        System.out.println("Square perimeter: " + s1.calculatePerimeter());
        System.out.println("Circle perimeter: " + s2.calculatePerimeter());
    }
}
