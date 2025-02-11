package Lesson23;

public class Test {
    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Animal an = new Mouse();
        t.abc(an);
    }
}

class Animal {

    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {

    void getName() {
        System.out.println("Mouse");
    }
}