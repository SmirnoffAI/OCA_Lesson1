package Lesson23;

public class Overriding {
    public static void main(String[] args) {
        Teacher1 t1 = new Teacher1();
        t1.eat();
    }
}


class Emp {

    protected double salary = 150;
    protected String name = "Kostya";
    protected int age;
    protected int experience;

    public Food eat() {
        System.out.println("Employee is eating...");
        Food f = new Food();
        return f;
    }

    public void sleep() {
        System.out.println("is sleeping...");
    }
}

class Teacher1 extends Emp {

    private int num_of_students;

    public Fruits eat() {
        System.out.println("Employee is eating...");
        Fruits f = new Fruits();
        return f;
    }

    public void teach() {
        System.out.println("is teaching...");
    }
}

class Food {
}

class Fruits extends Food {
}
