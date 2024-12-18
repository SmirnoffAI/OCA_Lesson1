package Homeworks.Lesson10.p1.p4;

import Homeworks.Lesson10.p1.A; // Импорт класса А.
import static Homeworks.Lesson10.p1.p2.B.*; // Импорт статичных атрибутов класса В.
import Homeworks.Lesson10.p1.p2.p3.C; // Импорт класса С.
import Homeworks.Lesson10.p1.p4.p5.E; // Импорт класс E;

public class D {

    String d = "This is D class";

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);
        System.out.println(b);
        System.out.println(b1);
        C c1 = new C();
        c1.c_method();
        System.out.println(c1.c);
        D d1 = new D();
        System.out.println(d1.d);
        E e1 = new E();
        System.out.println(e1.e);
    }
}
