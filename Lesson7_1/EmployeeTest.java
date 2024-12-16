package Lesson7_1;

public class EmployeeTest {
    public static void main(String[] args) {

        // Обращаюсь к классу Employee в другом пакете по полному имени Lesson7.Employee,
        // все это возможно благодаря access modifier "public".
        Lesson7.Employee emp = new Lesson7.Employee(200);
        System.out.println(emp.salary);
        emp.grade_salary();
    }
}
