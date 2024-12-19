package Homeworks.Lesson13;

public class Month {
    int mNum = 8;

    void countDays(){

        int flag;


        if (mNum == 2){
            flag = 3;
        }
        else if (mNum == 1 || mNum == 3 || mNum == 5 || mNum == 7 || mNum == 8 || mNum == 10 || mNum == 12){
            flag = 1;
        }
        else if (mNum == 4 || mNum == 6 || mNum == 9 || mNum == 11){
            flag = 2;
        }
        else {
            flag = 4;
        }

        switch (flag){
            case 1: System.out.println("31");
            break;
            case 2: System.out.println("30");
            break;
            case 3: System.out.println("28");
            default:
                System.out.println("Такого месяца не существует");
            }

    }

    public static void main(String[] args) {
        Month m1 = new Month();
        m1.countDays();
    }
}
