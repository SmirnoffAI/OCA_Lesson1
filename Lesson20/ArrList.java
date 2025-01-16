package Lesson20;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Privet");
        Car c = new Car();
        Student s = new Student();
        list.add(c);
        list.add(s);
        list.add(new StringBuilder("Ok"));

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Poka");
    }

}

class Car {
};

class Student {
};
