package Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> names = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder("Kostya");
        StringBuilder sb2 = new StringBuilder("Dasha");
        StringBuilder sb3 = new StringBuilder("Natasha");

        names.add(sb1);
        names.add(sb2);
        names.add(sb3);


        for (StringBuilder sb : names) {
            System.out.print(sb + " ");
        }

        // метод indexOf выводит -1, т.к. сравнение объектов StringBuilder идет по адресу, а не по значению.

        System.out.println(names.indexOf("Dasha"));
    }
}
