package Lesson20;


import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        ArrayList<StringBuilder> list2 = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder("a");
        StringBuilder sb2 = new StringBuilder("b");
        StringBuilder sb3 = new StringBuilder("c");
        StringBuilder sb4 = new StringBuilder("d");
        StringBuilder sb5 = new StringBuilder("e");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        list2.add(sb4);
        list2.add(sb5);

        // метод addAll добавляет значение всех элементов списка из другой коллекции.

        list.addAll(list2);

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }

        System.out.println();
        // метод remove

        //по индексу
        list.remove(4);

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }

        System.out.println();

        // по значению
        // не сработало бы со StringBuilder'ом так как метод equals вернет false, т.к. это разные объекты с одинаковым значением.

        ArrayList<String> list3 = new ArrayList<>();

        String s1 = "a";
        String s2 = "b";
        String s3 = "c";

        list3.add(s1);
        list3.add(s2);
        list3.add(s3);

        list3.remove("a");

        for (String s : list3) {
            System.out.print(s + " ");
        }

        System.out.println();

        // метод clear
        list.clear();

        for (StringBuilder sb : list) {
            System.out.print(sb + "*");
        }
    }

}
