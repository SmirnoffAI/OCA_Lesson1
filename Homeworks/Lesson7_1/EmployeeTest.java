// В данном пакете вызываю объекты пакета Homeworks.Lesson7

package Homeworks.Lesson7_1;

public class EmployeeTest {
    public static void main(String[] args) {

        // Разобраться почему я могу вывести private переменную в другом пакете???
        Homeworks.Lesson7.Employee emp1 = new Homeworks.Lesson7.Employee(1, "aue", 0.0);
        System.out.println(emp1.surname);
    }
}
