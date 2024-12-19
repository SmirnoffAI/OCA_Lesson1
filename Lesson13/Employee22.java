package Lesson13;

public class Employee22 {

    public static void main(String[] args) {
        int DenNedeli = 8;

        switch (DenNedeli){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Рабочий день до 18:00!");
            break;
            case 6: System.out.println("Рабочий день до 14:00!");
            break;
            case 7: System.out.println("Воскресенье выходной день!");
            default: System.out.println("Такого дня не существует!");
        }
    }
}
