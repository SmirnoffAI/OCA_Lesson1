package Lesson22;

public class Human {
    private String sex;
    private String name;
    private int age;
    private int weight;

    Human(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {

        if (age > 0 && age < 130) {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }


}

class Test1 {
    public static void main(String[] args) {

    }
}
