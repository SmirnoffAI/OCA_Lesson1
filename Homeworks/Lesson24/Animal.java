package Homeworks.Lesson24;


abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    abstract void swim();

    @Override
    public void sleep() {
        System.out.println("Fish sleep...");
    }
}

abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(this.name + " singing...");
    }
}

abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks...");
    }

}

class Swordtail extends Fish {

    public Swordtail(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Swordtail isn't a predatory fish, it eats only plants...");
    }

    @Override
    public void swim() {
        System.out.println("Swordtail is beautiful fish and swimming fast...");
    }
}

class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Penguins like eating fresh fish.");
    }

    @Override
    public void sleep() {
        System.out.println("Penguins sleep cuddled together.");
    }

    @Override
    public void fly() {
        System.out.println("Penguins can't fly.");
    }

    @Override
    public void speak() {
        System.out.println("Penguins can't sing like nightingales.");
    }
}

class Lion extends Mammal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Lions like eating meat like other predators.");
    }

    @Override
    public void run() {
        System.out.println("The lion isn't the fastest cat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lions sleep most of the day");
    }
}

class Lesson24 {
    public static void main(String[] args) {

        Swordtail swordtail = new Swordtail("Spear");
        System.out.println(swordtail.name);
        swordtail.swim();
        swordtail.eat();
        swordtail.sleep(); // Метод класса Fish.

        Speakable penguin = new Penguin("The king");
        penguin.speak(); // Могу вызвать только метод speak(), т.к. тип переменной объекта penguin - Speakable

        Animal lion = new Lion("Hungry");
        System.out.println(lion.name);
        lion.eat();
        lion.sleep();
        // Не могу вызвать метод run() класса Mammal т.к., тип переменной объекта lion - Animal
        
        Mammal lion2 = new Lion("Borrowed");
        System.out.println(lion2.name);
        lion2.eat();
        lion2.sleep();
        lion2.speak();
        lion2.run();

    }


}