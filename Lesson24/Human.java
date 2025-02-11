package Lesson24;

public class Human implements Jumpable {

    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements Jumpable {

    @Override
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface Jumpable {
    void jump();
}

class Main {
    public static void main(String[] args) {
        Jumpable j1 = new Human();
        Jumpable j2 = new Animal();

        j1.jump();
        j2.jump();
    }
}
