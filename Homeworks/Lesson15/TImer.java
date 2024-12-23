package Homeworks.Lesson15;

public class TImer {

    static void time() {

        int hours = 0;
        OUTER:
        while (hours < 24) {

            int minutes = 0;
            MIDDLE:
            do {
                minutes++;
                int seconds = 0;
                INNER:
                while (seconds < 60) {
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                    seconds++;
                }
            }
            while (minutes < 59);
            hours++;

        }
    }

    public static void main(String[] args) {
        time();
    }
}
