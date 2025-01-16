package Lesson20;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> sbList = new ArrayList<>();

        sbList.add(sb1);
        sbList.add(sb2);
        sbList.add(sb3);

        ArrayList<StringBuilder> sbList2 = (ArrayList<StringBuilder>) sbList.clone();
        System.out.println(sbList == sbList2);
    }

}
