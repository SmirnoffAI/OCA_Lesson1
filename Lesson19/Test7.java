package Lesson19;

public class Test7 {
    public static void main(String[] args) {
        int[] array = new int[4];


        // С помощью for each loop я не могу проводить динамическую инициализацию массива.
        // Использую for loop.
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }


        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
