package Lesson15;

public class Timer3 {

    public static void main(String[] args) {
        int hour = 0;
        OUTER:
        while (hour < 24) {
            int minutes = 0;
            INNER:
            for (; minutes < 60; minutes++) {
                System.out.println(hour + ":" + minutes);
            }
            hour++;
        }
    }
}
