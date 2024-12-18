package Homeworks.Lesson11;

public class Car {
    String color;
    String engine;
    public int doors;

    Car(String color, String engine, int doors){
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {
    static void changeDoors(Car c1, int doors){
        c1.doors = doors;
    }

    static void changeColor(Car c1, Car c2){
        String c3;
        c3 = c1.color;
        c1.color = c2.color;
        c2.color = c3;

    }

    public static void main(String[] args) {
        Car car = new Car("black", "V8", 4);
        Car car1 = new Car("white", "V8", 4);
        System.out.println(car.doors);
        changeDoors(car, 2);
        System.out.println(car.doors);
        changeColor(car, car1);
        System.out.println(car.color);
        System.out.println(car1.color);

    }
}
