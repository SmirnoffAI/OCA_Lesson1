package Homeworks.Lesson22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }

    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setCourse(int course) {
        if (course > 0 && course < 5) {
            this.course = course;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 10) {
            this.grade = grade;
        }
    }

    public int getGrade() {
        return this.grade;
    }

    public void showInfo() {
        System.out.println(getName());
        System.out.println(getCourse());
        System.out.println(getGrade());
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName(new StringBuilder("Kostya"));
        st1.getName().append("!!!!");
        st1.setCourse(2);
        st1.setCourse(100);
        st1.setGrade(8);
        st1.setGrade(11);
        st1.showInfo();
    }


}