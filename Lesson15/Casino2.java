package Lesson15;

public class Casino2 {
    public static void main(String[] args) {

        int money = 100;
        do {
            System.out.println("Делайте ставку!");
            System.out.println("Вы проиграли");
            System.out.println("Ваш баланс: " + money);
            money -= 10;
        }
        while (money >= 0);
    }
}
