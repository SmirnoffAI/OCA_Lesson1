package Homeworks.Lesson5;

public class BankAcc {
    BankAcc(int ID, double b){
        id = ID;
        balance = b;
    }
    int id;
    double balance;

    double Popolnenie(int a){
        balance += a;
        System.out.println("Пополнение прошло успешно");
        return balance;
    }

    double Snyatie(int a){
        balance -= a;
        System.out.println("Снятие прошло успешно");
        return balance;
    }

    void ShowInfo(){
        System.out.println("balance: " + balance);
    }
}

class BankAccTest{
    public static void main(String[] args) {
    BankAcc bA = new BankAcc(123, 1000.0);
    bA.ShowInfo();
    bA.Snyatie(200);
    bA.ShowInfo();
    bA.Popolnenie(150);
    bA.ShowInfo();
}
}