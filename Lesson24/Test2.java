package Lesson24;

public class Test2 {

}

interface I1 {
    void abc();

    default void def() {
        System.out.println("This is method 'def'");
    }
}
