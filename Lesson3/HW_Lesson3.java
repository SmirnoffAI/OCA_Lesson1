package Lesson3;

public class HW_Lesson3 {
    public static void main(String[] args){
         int i1 = 5;
         int i2 = 11;

         double d1 = 5.5;
         double d2 = 1.3;

         long l = 20L;
         double result = 0;

         result = i2 / d1 + d2 % i1 - l;

         System.out.println(result);

         int a = 5;
         a = a-- - --a + ++a + a++ + a; //6
         System.out.println(a);

         int b = 8;
         b = ++b - b++ + ++b - --b; // 1
         System.out.println(b);

    }
}
