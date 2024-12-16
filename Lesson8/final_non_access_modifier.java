package Lesson8;

public class final_non_access_modifier {
    public final int a = 10; // final - non access modifier, не позволяющий изменить значение переменной

    public static void main(String[] args) {
        final_non_access_modifier a1 = new final_non_access_modifier();
        // a1.a = a1.a * 2; - ошибка компилятора
        System.out.println(a1.a);
    }
}