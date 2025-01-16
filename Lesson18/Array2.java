package Lesson18;

public class Array2 {
    public static void main(String[] args) {
        String[] array1;
        int[][] array2;

        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = "privet" + i;
            System.out.println(array1[i]);
        }

        int[] array3 = {1, 2, 3}; // Статическое создание списка с присвоением значений.
    }
}
