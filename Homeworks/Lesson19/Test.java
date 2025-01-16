package Homeworks.Lesson19;

public class Test {

    static void abc(String[]... array) {

        int totalLength = 0;

        // Посчитали количество элементов в каждом массиве, чтобы создать новый массив, который содержит в себе все
        // переданные в него элементы.
        for (String[] arr : array) {
            totalLength += arr.length;
        }

        String[] resultArray = new String[totalLength];

        int currentIndex = 0; // Объявляю переменную индекса нового списка.

        for (String[] arr : array) {
            for (String s : arr) {
                resultArray[currentIndex++] = s; // вставляю элемент в список, увеличиваю переменную currentIndex на 1.
            }
        }

        // Превращаю command line параметры в null
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = null;
        }

        // Вывод на экран
        for (String s : resultArray) {
            System.out.print(s + " ");
        }

    }

    public static void main(String[] args) {
        abc();
    }
}
