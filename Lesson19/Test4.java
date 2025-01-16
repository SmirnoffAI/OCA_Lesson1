package Lesson19;

public class Test4 {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};

        // Вывод значений одномерных массивов внутри двумерного массива array с помощью for loop.

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        
        // Аналогичный вывод значений массивов с помощью foreach loop.

        for (int[] array2 : array) {
            for (int i : array2) {
                System.out.print(i + " ");
            }
        }


    }
}
