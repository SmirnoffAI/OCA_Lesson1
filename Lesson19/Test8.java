package Lesson19;

public class Test8 {
    public static void main(String[] args) {


        int[] array = {3, 1, -2, 0};
        int[] array2 = {-9, 1, 5, 2};

        for (int i = 0; i < array.length && i < array2.length; i++) {
            array[i] = 1;
            array2[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            System.out.println(array2[i] + " ");
        }
    }
}
