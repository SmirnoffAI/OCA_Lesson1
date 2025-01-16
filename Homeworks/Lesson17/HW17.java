package Homeworks.Lesson17;

public class HW17 {

    public static boolean ravenstvo(StringBuilder s, StringBuilder s1) {
        return s.toString().equals(s1.toString()); // перевожу значение в String, чтобы сравнение было не ссылочное, а по значению.
    }
}

class HW17test {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ABC");
        StringBuilder s1 = new StringBuilder("ABC");

        System.out.println(HW17.ravenstvo(s, s1));
    }
}
