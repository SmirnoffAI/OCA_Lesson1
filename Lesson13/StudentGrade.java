package Lesson13;

public class StudentGrade {
    int grade;

    StudentGrade(int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        StudentGrade st1 = new StudentGrade(5);

        switch (st1.grade){
            case 2: System.out.println("Bad student!");
            break;
            case 3: System.out.println("Normal student!");
            break;
            case 4: System.out.println("Good student!");
            break;
            case 5: System.out.println("Excellent student! Well done!");
            default: System.out.println("Uncorrected grade");
        }
    }
}
