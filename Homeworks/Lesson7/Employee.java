package Homeworks.Lesson7;

import java.security.PublicKey;

public class Employee {
    int id;
    public String surname;
    private double salary;

    public void ShowID(){
        System.out.println(id);
    }

    public void ShowSurname(){
        System.out.println(surname);
    }

    public void ShowSalary(){
        System.out.println(salary);
    }

    // public constructor
    public Employee(int id2, String surname2, double salary2){
        id = id2;
        surname = surname2;
        salary = salary2;
    }

    // default constructor
    Employee(int id3, String surname3){
        this(id3, surname3, 0.0);
    }

    // private constructor
    private Employee(double salary4){
        this(0, null);
    }
}
// Создаю объекты класса с помощью трех конструкторов
class EmployeeTest{
    public static void main(String[] args) {
        Employee public_emp = new Employee(0, "Public", 100.20);
        System.out.println(public_emp.surname);
        System.out.println(public_emp.id); // Переменная id доступна внутри пакета, т.к. имеет default access modifier
        public_emp.ShowID();
        public_emp.ShowSurname();
        // При попытке вывести значение переменной public_emp.salary, компилятор не позволяет т.к.
        // параметр salary имеет "private" access modifier
        // System.out.println(public_emp.salary)
        // но при этом метод, который выводит значение private переменной работает
        public_emp.ShowSalary();

        Employee default_emp = new Employee(1, "Default");
        System.out.println(default_emp.id);
        System.out.println(default_emp.surname);

        default_emp.ShowID();
        default_emp.ShowSalary();
        default_emp.ShowSurname();

        // При попытке вызова через private конструктор, компилятор выдает ошибку, т.к. вызов происходит вне класса
        // Employee private_emp = new Employee(100);
    }
}
