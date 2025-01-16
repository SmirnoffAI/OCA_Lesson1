package Lesson20;

import java.util.*;


public class Test9 {

    public static void main(String[] args) {

        StringBuilder math = new StringBuilder("Math");
        StringBuilder languages = new StringBuilder("Languages");
        StringBuilder physics = new StringBuilder("Physics");

        ArrayList<StringBuilder> exams = new ArrayList<>();
        exams.add(math);
        exams.add(languages);
        exams.add(physics);

        // метод toArray в данном случае возвращает array с типом данных Object.
        Object[] array = exams.toArray();

        for (Object o : array) {
            System.out.print(o + " ");
        }

        System.out.println();

        StringBuilder[] array1 = {math, math, physics, physics, languages};
        List<StringBuilder> list1 = Arrays.asList(array1);
        System.out.println(list1);

    }
}
