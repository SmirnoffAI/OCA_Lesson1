package Homeworks.Lesson17;

public class HW17_1 {

    public static boolean ravenstvo(StringBuilder a, StringBuilder b) {
        boolean result = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    result = false;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

class HW17_1test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Good day!");
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder("Bad night!");

        System.out.println(HW17_1.ravenstvo(sb1, sb2));
        System.out.println(HW17_1.ravenstvo(sb2, sb3));
    }
}