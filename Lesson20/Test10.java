package Lesson20;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test10 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s2);
        list1.add(s4);
        list1.add(s1);

        System.out.println(list1 + " - неотсортированный список");

        // статический метод класса Collections sort -> void, сортирует список.
        Collections.sort(list1);

        System.out.println(list1 + " - отсортированный список");

        // метод equals, возвращает true, если все элементы списка одинаковы.
        ArrayList<String> list2 = list1;
        System.out.println(list2.equals(list1));

        // Другой пример. Создав новый список и добавив те же элементы в этот список, метод возвращает true
        ArrayList<String> list3 = new ArrayList<>();
        list3.add(s1);
        list3.add(s2);
        list3.add(s3);
        list3.add(s4);

        System.out.println(list2.equals(list3));

        Iterator<String> it = list1.iterator(); // Объект итератора позволит нам пробежаться по всем элементам списка.
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // Пример реализации кода по удалению всех элементов с помощью итератора.
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
