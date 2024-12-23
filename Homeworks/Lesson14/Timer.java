package Homeworks.Lesson14;

public class Timer {
    static void time() {
        HOURS:
        for (int h = 0; h < 6; h++) {

            MINUTES:
            for (int m = 0; m < 60; m++) {
                {
                    if (h > 1 && m % 10 == 0) {
                        break HOURS;
                    }

                    SECONDS:
                    for (int s = 0; s < 60; s++) {
                        if (s * h > m) {
                            continue MINUTES;
                        }
                        System.out.println(h + ":" + m + ":" + s);
                    }
                }


            }

        }
    }

    public static void main(String[] args) {
        time();
    }
}

