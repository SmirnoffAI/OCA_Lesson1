package Lesson18;

public class Array4 {

    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Max = " + max + " | Min = " + min);
    }

    public static void main(String[] args) {
        double[] array1 = {3.14, 5.5, 0.7, -8.4, -13.1};

        maxMin(array1);

    }
}

