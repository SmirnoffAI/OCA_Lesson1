package Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("OK");
        StringBuilder sb3 = new StringBuilder("Good bye");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }

        System.out.println();
        // С помощью метода get, получаю объект из списка, при помощи метода append, изменяю его

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
    }
}
