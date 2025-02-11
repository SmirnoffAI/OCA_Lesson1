package Lesson23;

public class Employee {

    protected double salary = 150;
    protected String name = "Kostya";
    protected int age;
    protected int experience;

    public void eat() {
        System.out.println("is eating...");
    }

    public void sleep() {
        System.out.println("is sleeping...");
    }
}

class Doctor extends Employee {

    public void heal() {
        System.out.println("is healing...");
    }
}

class Surgeon extends Doctor {

    private String scalpel;

    public void operation() {
        System.out.println("The surgeon performs an operation.");
    }
}

class Teacher extends Employee {

    private int num_of_students;

    public void teach() {
        System.out.println("is teaching...");
    }
}

class Driver extends Employee {

    private String carModel;

    public void drive() {
        System.out.println("is driving...");
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();
        Surgeon s = new Surgeon();

        Employee emp = new Doctor(); // Переменная супер класса может ссылаться на объект подкласса, но не наоборот.

        // Еще примеры.
        Employee s1 = new Surgeon();
        Doctor s2 = new Surgeon();

    }


}

