package Lesson16;

public class Employee {

    boolean isManager;
    double salary;

    Employee(double salary, boolean isManager) {
        this.isManager = isManager;
        this.salary = salary;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(1000.55, true);

        // применили конкатенацию строк, при попытке сложить boolean isManager и double salary,
        // компилятор выдает ошибку из-за попытки сложения переменных разных типов данных.
        System.out.println("Is manager? - " + emp.isManager + " | salary - " + emp.salary);
    }
}
