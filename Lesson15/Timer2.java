package Lesson15;

public class Timer2 {

    public static void main(String[] args) {

        int hour = 0;
        OUTER:
        do {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour += 1;
        }
        while (hour < 24);
    }

}
