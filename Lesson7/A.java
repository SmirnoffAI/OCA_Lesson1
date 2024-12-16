package Lesson7;

public class A {
    public static void main(String[] args) {
        // Класс А обращается к классу Б внутри пакета по имени.
        B object = new B();

        // Класс А обращается к классу Employee1 по полному имени, включая название пакета
        // чтобы это было возможно, добавил перед конструктором access modifier "public".
        Lesson6.Employee1 emp = new Lesson6.Employee1("Smirnov", 22);
    }
}
