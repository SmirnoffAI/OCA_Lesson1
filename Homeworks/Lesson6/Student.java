package Homeworks.Lesson6;

public class Student {
    Student(int id2, String surname2, String name2, int course2, double avg2){
    id = id2;
    surname = surname2;
    name = name2;
    course = course2;
    avg = avg2;
    }

    Student(int id2, String surname2, String name2){
        this(id2, surname2, name2, 0, 0.0);
    }

    Student(){
        this(0, null, null ,0, 0.0);
    }

    int id;
    String surname;
    String name;
    int course;
    double avg;
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println(st1.surname);

        Student st2 = new Student(1, "Petrov", "Ivan");
        System.out.println(st2.surname);

        Student st3 = new Student(3, "Smirnov", "Konstantin", 3, 4.4);
        System.out.println(st3.avg);

    }
}
