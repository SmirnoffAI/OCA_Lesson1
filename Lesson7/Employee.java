package Lesson7;

public class Employee {
    public double salary;

    public void grade_salary(){
        System.out.println("Новая з/п = " + salary * 2);
    }

    public Employee(double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1200.50);
        System.out.println(emp.salary);
        emp.grade_salary();
    }
}

