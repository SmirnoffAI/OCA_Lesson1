package Lesson27;

public class ExceptionCatching {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
            System.out.println(array[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There was an exception!: " + e);
        } finally {
            System.out.println("This is finally block code");
        }

        System.out.println("This is main code");

    }
}
