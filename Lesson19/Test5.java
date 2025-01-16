package Lesson19;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};

        for (int i = 0; i < array.length; i++) {
            array[i] = 3; // заменил все значения списка значением 3.
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // C помощью for each loop нельзя изменить тип данных в списке.

        for (int i : array) {
            i = 4;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
