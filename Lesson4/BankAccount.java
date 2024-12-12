package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    public static void main(String[] args){

        BankAccount HisAccount = new BankAccount();
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Kostya";
        MyAccount.balance = 1203;

        HisAccount.id = 2;
        HisAccount.name = "Kirill";
        HisAccount.balance = 12231;

        YourAccount.id = 3;
        YourAccount.name = "Dasha";
        YourAccount.balance = 13;

        System.out.println(MyAccount.id);
        System.out.println(MyAccount.name);
        System.out.println(MyAccount.balance);
    }
}

class BankAccountTest{
    public static void main(String[] args){

        BankAccount HisAccount = new BankAccount();
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Kostya";
        MyAccount.balance = 1203;

        HisAccount.id = 2;
        HisAccount.name = "Kirill";
        HisAccount.balance = 12231;

        YourAccount.id = 3;
        YourAccount.name = "Dasha";
        YourAccount.balance = 13;

    }
}