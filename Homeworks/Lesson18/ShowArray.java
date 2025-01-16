package Homeworks.Lesson18;

public class ShowArray {

    public static void showArray(String[][] array) {
        System.out.print("{  ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("{ ");
            }
        }
    }

    public static void main(String[] args) {
        String[][] array = {{"a"}, {"b", "c"}};
        showArray(array);
    }
}
