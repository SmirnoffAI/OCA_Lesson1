package Homeworks.Lesson6;

public class HomeWorkClass {
    int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    int sum(int a, int b){
        return a + b;
    }

    int sum(int a){return a;}

    int sum(){
        return 0;
    }
}

class HomeWorkClassTest{
    public static void main(String[] args) {
        HomeWorkClass hw1 = new HomeWorkClass();
        int i1 = hw1.sum();
        System.out.println(i1);

        HomeWorkClass hw2 = new HomeWorkClass();
        int i2 = hw2.sum(1);
        System.out.println(i2);

        HomeWorkClass hw3 = new HomeWorkClass();
        int i3 = hw3.sum(1, 2);
        System.out.println(i3);

        HomeWorkClass hw4 = new HomeWorkClass();
        int i4 = hw4.sum(1, 2, 3);
        System.out.println(i4);

        HomeWorkClass hw5 = new HomeWorkClass();
        int i5 = hw3.sum(1, 2, 3, 4);
        System.out.println(i5);
    }
}

