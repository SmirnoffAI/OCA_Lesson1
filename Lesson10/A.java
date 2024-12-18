package Lesson10;

import Lesson9.Car;
import Lesson9.*;
import static Lesson9.Car.a;
import static Lesson9.Car.*; // все статичные элементы классы

public class A {
    public static void main(String[] args) {
        // Использую import, чтобы использовать класс Car по короткому имени в другом пакете.
        Car car = new Car("Black", "V8");
        // Использовав import <<package_name.*;>> импортировал все классы из стороннего пакета.
        Student st1 = new Student();
        System.out.println(a);
    }
}
