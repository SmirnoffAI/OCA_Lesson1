package Lesson16;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abc(String color) {
        Car car1 = new Car(color, "V4");
        return car1;
    }

    public static void main(String[] args) {
        Car c = new Car("White", "V6");
        Car c2 = c.abc("Black");
        System.out.println(c.color);
    }
}

class TestCar {
    final static Car car = new Car("red", "V8");

}