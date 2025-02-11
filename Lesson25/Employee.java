package Lesson25;

abstract class Employee {

    public void sleep() {
        System.out.println("An employee sleeps.");
    }

    abstract void work();
}

class Teacher extends Employee {

    @Override
    public void work() {
        System.out.println("A teacher works.");
    }
}

class Driver extends Employee {

    @Override
    public void work() {
        System.out.println("A driver works.");
    }
}

class Doctor extends Employee {

    @Override
    public void work() {
        System.out.println("A doctor works");
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Employee emp2 = new Driver();
        Employee emp3 = new Teacher();

        emp1.work();
        emp2.work();
        emp3.work();
    }
}