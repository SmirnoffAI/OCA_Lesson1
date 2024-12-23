package Lesson15;

public class Casino {
    public static void main(String[] args) {

        int money = 100;

        while (money > 0) {
            System.out.println("Вы успешно сделали ставку!");
            System.out.println("-------------------");
            System.out.println("Вы проиграли.");
            System.out.println();

            money -= 10;
        }
    }
}
