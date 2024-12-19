package Homeworks.Lesson12;

public class Student1 {
    String name;
    int course;
    double grade;

    Student1(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

class StudentTest1{
    static void isEqual(Student1 s1, Student1 s2){
        if (s1.name.equals(s2.name) && s1.grade == s2.grade && s1.course == s2.course){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    static void isEqual2(Student1 s1, Student1 s2){
        if(s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Студенты одинаковы!");
                } else {
                    System.out.println("У студентов разные оценки!");
                }
            } else {
                System.out.println("У студентов разные курсы!");
            }
        } else{
            System.out.println("У студентов разные имена!");
                }
            }


    public static void main(String[] args) {
        Student1 st1 = new Student1("Ivan", 4, 3);
        Student1 st2 = new Student1("Ivan", 4, 3);
        Student1 st3 = new Student1("Ivan", 4, 4);
        Student1 st4 = new Student1("Ivan", 4, 3);
        isEqual(st1, st2);
        isEqual(st3, st4);
        isEqual2(st1, st3);
        isEqual2(st1, st2);
    }
}