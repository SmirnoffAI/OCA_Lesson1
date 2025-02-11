package Lesson24;


public abstract class Figure {

    protected int sides = 0;

    abstract void perimeter();

    abstract void area();
}

class Square extends Figure {
    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
        this.sides = 4;
    }


    @Override
    public void perimeter() {
        System.out.println(sideLength * sides);
    }

    @Override
    public void area() {
        System.out.println(sideLength * sideLength);
    }

}

class Circle extends Figure {
    double radius;
    final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        System.out.println(2 * pi * radius);
    }

    @Override
    public void area() {
        System.out.println(pi * radius * radius);
    }
}

class Rectangle extends Figure {
    int shortSideLength;
    int longSideLength;

    public Rectangle(int shortSideLength, int longSideLength) {
        this.shortSideLength = shortSideLength;
        this.longSideLength = longSideLength;
    }

    @Override
    public void perimeter() {
        System.out.println((shortSideLength + longSideLength) * 2);
    }

    @Override
    public void area() {
        System.out.println(shortSideLength * longSideLength);
    }
}

class Test {
    public static void main(String[] args) {
        Square sq = new Square(5);
        Circle circle = new Circle(4);
        Rectangle rec = new Rectangle(2, 5);

        sq.perimeter();
        sq.area();

        circle.perimeter();
        circle.area();

        rec.perimeter();
        rec.area();
    }
}