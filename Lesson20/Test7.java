package Lesson20;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Метод isEmpty -> boolean
        System.out.println(list.isEmpty());

        String s1 = "ABC";
        String s2 = "DEF";

        list.add(s1);
        list.add(s2);

        System.out.println(list.isEmpty());

        // метод size -> int
        System.out.println(list.size());

        // метод contains -> boolean
        System.out.println(list.contains(s2));

        // метод toString -> String
        System.out.println(list.toString());

        
    }
}
