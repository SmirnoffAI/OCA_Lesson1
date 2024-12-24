package Lesson16;

public class StringMethods {


    public static void main(String[] args) {
        String s1 = new String("AaBbCcBbCc");
        String str1 = new String("    Abc            ");
        String str2 = new String("Hello");

        int a = s1.length(); // метод length() -> int, возвращает длину строки.
        System.out.println(a); // 10

        char c = s1.charAt(3); // метод charAt -> char, возвращает символ, находящийся по номеру переданному как аргумент.
        System.out.println(c); // b

        int i1 = s1.indexOf('b'); // метод indexOf -> int, в данном случае метод возвращает индекс символа, который был передан в аргумент метода.
        System.out.println(i1); // 3

        int i2 = s1.indexOf("BbC"); // в данном случае метод возвращает индекс с которого начинается строка.
        System.out.println(i2); // 2, индекс 'B' = 2

        int i3 = s1.indexOf('z'); // в данном случае, если искомого элемента не было, метод возвращает -1
        System.out.println(i3); // -1

        int i4 = s1.indexOf("Bb", 4); // в данном случае, метод начинает поиск после заданного индекса, переданного в аргумент метода.
        System.out.println(i4); // 6

        boolean i5 = s1.startsWith("A"); // метод startsWith() -> boolean, метод возвращает логическое да или нет,
        // если указанная строка начинается с буквы или нескольких букв.
        System.out.println(i5); // true

        boolean i6 = s1.startsWith("Bb", 2); // в данном случае, метод начинает поиск после заданного индекса, переданного в аргумент метода.
        System.out.println(i6); // true

        boolean i7 = s1.endsWith("cC"); // метод возвращает логическое да или нет, если строка заканчивается также как значение, переданное в аргумент.
        System.out.println(i7); // false

        String s2 = s1.substring(3); // метод substring() -> String, метод принимает значение строки, начиная с индекса переданного в качестве аргумента.
        System.out.println(s2); // bCcBbCc

        String s3 = s1.substring(3, 6); // метод принимает значение от первого аргумента включительно, до второго не включительно.
        System.out.println(s3); // bCc

        String s4 = str1.trim(); // метод убирает пробелы по бокам.
        System.out.println(s4);

        String s5 = str2.replace('l', 'L'); // метод проводит замену char в строке.
        System.out.println(s5); // HeLLo

        String s6 = str2.replace("Hell", "HELL"); // метод проводит замену String в строке.
        System.out.println(s6); // HELLo

        String s7 = "Hello, ";
        String s8 = "friend";

        String s9 = s7.concat(s8); // метод конкатенации.
        System.out.println(s9); // "Hello, friend".

        String s10 = s1.toLowerCase(); // метод возвращает строку, приведенную к нижнему регистру.
        System.out.println(s10); // aabbccbbcc

        String s11 = s1.toUpperCase(); // метод возвращает строку, приведенную к верхнему регистру.
        System.out.println(s11); // AABBCCBBCC

        boolean b1 = s1.contains("Aa"); // метод contains -> boolean, метод проверяет, содержится ли переданная в качестве
        // аргумента строка в исходной строке.
        System.out.println(b1); // true

        
    }
}
