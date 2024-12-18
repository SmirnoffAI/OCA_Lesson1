package Lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this. grade = grade;
    }

    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void ChangeName(Student s1){
        s1.name = "Vasiliy";
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 4, 97.3);
        Student st2 = new Student("Petr", 3, 99.8);
        Student.swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

        Student.ChangeName(st1);
        System.out.println(st1.name);

    }
}