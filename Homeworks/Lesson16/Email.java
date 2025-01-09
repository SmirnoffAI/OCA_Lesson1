package Homeworks.Lesson16;

public class Email {

    static String mails = "abc@mail.ru; abc@yandex.ru; abc@gmail.com;";


    static void mail(String mails) {
        int a = 0; // позиция @
        int b = 0; // позиция .
        int c = 0; // позиция ;
        while (c < mails.length() - 1) {

            a = mails.indexOf('@', c);
            b = mails.indexOf('.', c);
            c = mails.indexOf(';', c + 1);

            System.out.println(mails.substring(a + 1, b));

        }

    }

    public static void main(String[] args) {
        mail(mails);

    }


}