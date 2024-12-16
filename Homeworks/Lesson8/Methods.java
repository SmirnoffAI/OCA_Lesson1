package Homeworks.Lesson8;

public class Methods {

    static int multi(int a, int b, int c) {
        int result = a * b * c;
        System.out.println(result);
        return result;
    }

    static void divide(int a, int b) {
        double result = a / b;
        double ostatok = a % b;
        System.out.println("Result: " + result + " Ostatok:" + ostatok);
    }
}

class MethodsTest{
    public static void main(String[] args) {
        Methods m1 = new Methods();
        m1.multi(3, 3, 3);
        m1.divide(4, 16);
        Methods.divide(4,3);
        Methods.multi(2 ,2 ,2);
    }
}