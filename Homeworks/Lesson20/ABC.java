package Homeworks.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class ABC {

    static ArrayList<String> abc(String... args) {
        ArrayList<String> result = new ArrayList<>(); // Создал ArrayList для добавления в него уникальных значений.

        // enhanced for loop пробегается по каждому элементу и проверяет, содержится ли он в списке.
        for (String s : args) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(abc("B", "C", "D", "A", "A", "B", "C"));

    }
}
