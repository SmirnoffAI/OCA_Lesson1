package Lesson8;

public class Student {
    String name;
    int course;
    // С помощью модификатора static, я создал переменную класса, эта переменная отсутствует у объектов этого класса
    static int counter;

    public Student(String name2, int course2) {
        counter++;
        name = name2;
        course = course2;
        System.out.println("Student #" + counter + " was created!");
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Kostya", 2);
        Student st2 = new Student("Ivan", 4);

    }
}
