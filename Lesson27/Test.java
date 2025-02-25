package Lesson27;

public class Test {
    public static void main(String[] args) {
        Animal t = new Tiger();
        System.out.println(t.a);
        System.out.println(t.b);
        t.abc();
        t.def();
    }
}

class Animal {
    int a = 5;
    static int b = 10;

    void abc() {
        System.out.println("Animal's class non-static method");
    }

    static void def() {
        System.out.println("Animal's class static method");
    }
}

class Tiger extends Animal {
    int a = 15;
    static int b = 20;

    void abc() {
        System.out.println("Tiger's class non-static method");
    }

    static void def() {
        System.out.println("Tiger's class static method");
    }
}