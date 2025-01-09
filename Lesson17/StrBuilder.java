package Lesson17;

public class StrBuilder {

    public static void main(String[] args) {

        // Создание объектов класса StringBuilder

        StringBuilder sb1 = new StringBuilder(); // по умолчанию в SB находится 16 символов, но он этим не ограничен
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50); // при указании в параметре int, обозначает вместимость символов
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(2));
        System.out.println(sb2.indexOf("a", 2));
        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5);
        System.out.println(s2);

        sb2.append(sb2);
        System.out.println(sb2);

        StringBuilder sb5 = new StringBuilder("Dasha");
        sb5.insert(2, ", Da");
        System.out.println(sb5);

        sb5.delete(1, 5);
        System.out.println(sb5);

        sb5.reverse();
        System.out.println(sb5);
        sb5.reverse();

        sb5.replace(0, 3, "HHH");
        System.out.println(sb5);
    }
}
