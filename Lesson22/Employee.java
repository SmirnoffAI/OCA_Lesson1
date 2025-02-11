package Lesson22;

public class Employee {
    private String name;
    private int age;
    private int experience;

}

class Doctor extends Employee {

    public void heal() {
        System.out.println("Доктор лечит...");
    }
}

class Driver extends Employee {

    public void drive() {
        System.out.println("Водитель водит...");
    }
}

class Teacher extends Employee {
    private int students;

    public void teach() {
        System.out.println("Учитель учит " + students + " ученик(а, ов)");
    }
}