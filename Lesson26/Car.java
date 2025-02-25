package Lesson26;

public class Car {

    protected String color;
    protected String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            return color.equals(((Car) obj).color) && engine.equals(((Car) obj).engine);
        } else return false;
    }

    @Override
    public String toString() {
        return "Car's color - " + this.color + ", car's engine - " + this.engine;
    }


}

class Main {
    public static void main(String[] args) {
        Car c1 = new Car("red", "v6");
        Car c2 = new Car("red", "v6");
        Car c3 = new Car("black", "v6");

        System.out.println(c3);
    }
}