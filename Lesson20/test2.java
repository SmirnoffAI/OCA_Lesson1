package Lesson20;

import java.util.ArrayList;

public class test2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Метод add
        list.add("poka");
        list.add(1, "privet");

        // Метод get
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Метод set заменяет значение в списке, заменяет значение в списке.
        list.set(1, "haha");


        for (String s : list) {
            System.out.print(s + " ");
        }

    }

}
