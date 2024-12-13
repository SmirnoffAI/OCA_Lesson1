package Homeworks.Lesson5;

public class Student_HW5 {
    Student_HW5(int ID, String Surname, String Name, String Study_year, double Math, double Econom, double Lang){
        id = ID;
        surname = Surname;
        name = Name;
        study_year = Study_year;
        math = Math;
        economics = Econom;
        languages = Lang;
    }
        int id;
        String surname;
        String name;
        String study_year;
        double math;
        double economics;
        double languages;

        double avg(double Math, double Econom, double Lang){
            double sum = Math + Econom + Lang;
            double result = sum/3;
            return result;
        }

        void ShowInfo(){
            System.out.println("AVG: " + avg(math, economics, languages));
        }
}

class StudentHW_5Test{
    public static void main(String[] args) {
        Student_HW5 student = new Student_HW5(1,"Smirnov", "Konstantin", "2020", 4.0, 4.0, 4.0);
        student.ShowInfo();



    }
}
