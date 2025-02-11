package Homeworks.Lesson22;

import Homeworks.Lesson10.p1.p4.D;

public class Animal {

    private int eyes;

    public Animal() {
        System.out.println("I'm an animal!");
    }

    protected int getEyes() {
        return eyes;
    }

    protected void setEyes(int eyes) {
        this.eyes = eyes;
    }

    protected void eat() {
        System.out.println("Animal eats");
    }

    protected void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {

    protected String name;
    protected int tail = 1;
    protected int paws = 4;

    public int getPaws() {
        return paws;
    }

    public Pet() {
        setEyes(2);
        System.out.println("I'm a pet!");

    }

    public void run() {
        System.out.println("Pet's running");
    }

    public void jump() {
        System.out.println("Pet's jumping");
    }
}

class Dog extends Pet {

    public Dog(String name) {
        this.name = name;
        System.out.println("I'm a dog and my name " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    public Cat(String name) {
        this.name = name;
        System.out.println("I'm a cat and my name " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Barbos");
        Cat cat = new Cat("Murka");

        System.out.println(dog.getPaws());
        cat.sleep();
    }
}