package Lesson20;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        String s1 = new String("Kostya");
        String s2 = new String("Dasha");
        String s3 = new String("Natasha");
        String s4 = s1;

        names.add(s1);
        names.add(s2);
        names.add(s3);
        names.add(s4);


        for (String s : names) {
            System.out.print(s + " ");
        }

        // метод indexOf выводит верный индекс искомого.

        System.out.println(names.indexOf("Dasha"));
        System.out.println();

        // метод lastIndexOf выводит самый последний индекс для искомого объекта.

        for (String s : names) {
            System.out.print(s + " ");
        }

        System.out.println(names.indexOf("Kostya"));
        System.out.println(names.lastIndexOf("Kostya"));
    }
}
