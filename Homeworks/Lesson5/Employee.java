package Homeworks.Lesson5;

public class Employee {
    Employee(int ID, String Surname, String Age, int Salary, String Department) {
    id = ID;
    surname = Surname;
    age = Age;
    salary = Salary;
    department = Department;
    }

    int id;
    String surname;
    String age;
    int salary;
    String department;

    int salaryUp(){
        salary *= 2;
        return salary;
    }

    void ShowInfo(){
        System.out.println(salary);
    }

}

class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Smirnov", "22", 2000, "OSKO");
        employee.ShowInfo();
        employee.salaryUp();
        employee.ShowInfo();

        Employee employee1 = new Employee(2, "Ivanov", "22", 1000, "OOP");
        employee1.ShowInfo();
        employee1.salaryUp();
        employee1.ShowInfo();
    }
}