package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double salaryUp(double a){
        a *= 2;
        return a;
    }

    public double salary2(){
        salary *= 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Petya", 1000);
        double d = emp1.salaryUp(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.salary2();
        System.out.println(emp1.salary);
    }
}