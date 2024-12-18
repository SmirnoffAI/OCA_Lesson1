package Lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    public static int a = 10;

    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void ShowColor(){
        System.out.println("Цвет машины: " + color);
    }

    public void ChangeColor(String color){
        System.out.println("Цвет машины изменился");
        this.color = color;
    }
}

class CarTest{
    public static void main(String[] args) {
        Car c = new Car("Black", "V8");
        c.ShowColor();
        c.ChangeColor("Red");
        c.ShowColor();
    }
}