package Lesson19;

public class Test3 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"Math", "Languages", "Economics"};

        for (String s : students) { // переменная s принимает значение из массива students по очереди
            for (String s1 : exams) {
                System.out.println(s + " " + s1);
            }
        }
    }
}
