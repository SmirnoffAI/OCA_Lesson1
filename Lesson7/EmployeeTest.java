package Lesson7;

// Проверяю видимость класса Employee в другом классе того же пакета.
public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee(100.0);
        System.out.println(emp.salary);
        emp.grade_salary();
    }
}
