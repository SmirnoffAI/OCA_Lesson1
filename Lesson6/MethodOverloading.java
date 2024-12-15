package Lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
    }

    void show(boolean b1){
        System.out.println(b1);
    }

    void show(String s1){
        System.out.println(s1);
    }

    void show(int a1, String s1){
        System.out.println("int: " +  a1 + " " + "String: " + s1);
    }

    void show(String s1, int a1){
        System.out.println("Well done");
    }
}


class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        mO.show(100);
        mO.show(true);
        mO.show("privet");
        mO.show(1, "q");
        mO.show("sad", 12);
    }
}