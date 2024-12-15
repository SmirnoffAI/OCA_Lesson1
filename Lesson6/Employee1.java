package Lesson6;

public class Employee1 {
    Employee1(int id2, String surname2, int age2, double salary2,String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    Employee1(String surname2, int age2) {
        this(0, surname2, 22, 0.0, null);
    }

    Employee1(int id2, String surname2, int age2){
        // this должен быть первым внутри конструктора.
        // с помощью this вызываю конструктор по 2 его атрибутам, т.к. конструктор не может вызвать внутри себя overloaded конструктор.
        this(id2, surname2, age2, 0.0, null);
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    void ShowInfo(){
        System.out.println(id + " " + surname + " " + age + " " + salary + " " + department);
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee1 emp = new Employee1(1, "Ivanov", 22);
        System.out.println(emp.surname);

        Employee1 emp1 = new Employee1("Smirnov", 22);
        System.out.println(emp1.surname + " " + emp1.age);

        Employee1 emp2 = new Employee1(3,"Sidorov", 22, 100.0, "OSKO");
        emp2.ShowInfo();

    }
}