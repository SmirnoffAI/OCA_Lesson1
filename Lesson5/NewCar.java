package Lesson5;

public class NewCar {
    NewCar(String cvet, String motor){
        color = cvet;
        engine = motor;
    }
    String color;
    String engine;
    int speed = 60;

    int gas_up(int km){
        speed += km;
        return speed;
    }

    int break_down(int km){
        speed -= km;
        return speed;
    }

    void ShowInfo(){
        System.out.println(color);
        System.out.println(engine);
        System.out.println(speed);
    }
}

class NewCarTest{
    public static void main(String[] args){
        NewCar car = new NewCar("yellow", "V8");
        car.gas_up(15);
        car.ShowInfo();
        car.break_down(15);
        car.ShowInfo();
    }
}

