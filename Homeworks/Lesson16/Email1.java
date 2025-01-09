package Homeworks.Lesson16;

public class Email1 {

    static String mail = "abc@mail.ru; abc@yandex.ru; abc@gmail.com;";

    static void mail() {

        int a = 0; // @
        int b = 0; // .
        int c = 0; // ;

        while (c < mail.length() - 1) {

            a = mail.indexOf('@', c);
            b = mail.indexOf('.', c);
            c = mail.indexOf(';', c + 1);

            System.out.println(mail.substring(a + 1, b));
        }

    }

    public static void main(String[] args) {
        mail();
    }

}
