package Homeworks.Lesson8;

public class Circle {

    Circle(double r){
        radius = r;
    }
    final static double pi = 3.14;
    double radius;

    double CircleArea(double radius){
        return pi * radius * radius;
    }

    static double CircleLength(double radius){
        return pi * 2 * radius;
    }

    void CircleInfo(){
        System.out.println("R = " + radius);
        System.out.println("S = " + CircleArea(radius));
        System.out.println("L = " + CircleLength(radius));
    }
}

class CircleTest{
    public static void main(String[] args) {

        Circle circle = new Circle(20);

        circle.CircleArea(20);
        Circle.CircleLength(30);
        circle.CircleInfo();
    }
}
