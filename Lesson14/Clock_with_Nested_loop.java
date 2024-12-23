package Lesson14;

public class Clock_with_Nested_loop {
    public static void main(String[] args) {
        OUTER: for (int i = 0; i < 24; i++){
            INNER: for (int j = 0; j < 60; j++){
                System.out.println(i + ":" + j);

                if (j == 30){
                    break INNER;
                }
            }
        }
    }
}
