package Homeworks.Lesson9;

public class Objects {
    public static void make_6_objects(){
        Objects o1 = new Objects();
        Objects o2 = new Objects();
        Objects o3 = new Objects();
        Objects o4 = new Objects();
        Objects o5 = new Objects();
        Objects o6 = new Objects();
    }
}
class Main{
    public static void main(String[] args) {
        Objects o7 = new Objects();
        Objects.make_6_objects();
        Objects o8 = new Objects();
    }
}
