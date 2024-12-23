package Lesson15;

public class do_while_loop {

    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i); //В независимости от условия в цикле while, код будет выполнен как минимум 1 раз.
            i++;
        }
        while (i == 10);

        System.out.println(i);
    }
}
