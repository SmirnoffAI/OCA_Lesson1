package Lesson19;

public class Test6 {
    public static void main(String[] args) {
        String[] array = {"ok", "privet", "poka"};

        // С помощью for each loop, я не могу изменить значения в списке.
        //for (a : array){
        //    a = new String("hello");
        //}

        // Реализация смены значений с помощью метода append.

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Good bye");
        StringBuilder sb3 = new StringBuilder("Ok");

        StringBuilder[] sbArray = {sb1, sb2, sb3};

        for (StringBuilder sb : sbArray) {
            sb.append(", Java");
        }

        for (StringBuilder i : sbArray) {
            System.out.println(i + " ");
        }
    }
}
