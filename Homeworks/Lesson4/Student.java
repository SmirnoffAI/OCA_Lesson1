package Homeworks.Lesson4;

public class Student {
    int id;
    String surname;
    String name;
    String study_year;
    double math;
    double economics;
    double languages;


}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.id = 1;
        student1.surname = "Smirnov";
        student1.name = "Konstantin";
        student1.study_year = "2023";
        student1.math = 4.4;
        student1.economics = 4.3;
        student1.languages = 4.5;

        System.out.println("Номер зачетной книжки: " + student1.id);
        System.out.println("Фамилия учащегося: " + student1.surname);
        System.out.println("Имя учащегося: " + student1.name);
        System.out.println("Год поступления: " + student1.study_year);
        System.out.println("Математика: " + student1.math);
        System.out.println("Экономика: " + student1.economics);
        System.out.println("Иностранные языки: " + student1.languages);
        System.out.println("Средняя оценка: " + (student1.math + student1.economics + student1.languages)/3);
        System.out.println();

        Student student2 = new Student();

        student2.id = 2;
        student2.surname = "Ivanov";
        student2.name = "Petr";
        student2.study_year = "2022";
        student2.math = 4.1;
        student2.economics = 3.3;
        student2.languages = 5.0;

        System.out.println("Номер зачетной книжки: " + student2.id);
        System.out.println("Фамилия учащегося: " + student2.surname);
        System.out.println("Имя учащегося: " + student2.name);
        System.out.println("Год поступления: " + student2.study_year);
        System.out.println("Математика: " + student2.math);
        System.out.println("Экономика: " + student2.economics);
        System.out.println("Иностранные языки: " + student2.languages);
        System.out.println("Средняя оценка: " + (student2.math + student2.economics + student2.languages)/3);
        System.out.println();

        Student student3 = new Student();

        student3.id = 3;
        student3.surname = "Sidorov";
        student3.name = "Ivan";
        student3.study_year = "2023";
        student3.math = 2.1;
        student3.economics = 3.3;
        student3.languages = 3.0;

        System.out.println("Номер зачетной книжки: " + student3.id);
        System.out.println("Фамилия учащегося: " + student3.surname);
        System.out.println("Имя учащегося: " + student3.name);
        System.out.println("Год поступления: " + student3.study_year);
        System.out.println("Математика: " + student3.math);
        System.out.println("Экономика: " + student3.economics);
        System.out.println("Иностранные языки: " + student3.languages);
        System.out.println("Средняя оценка: " + (student3.math + student3.economics + student3.languages)/3);
        System.out.println();
    }
}