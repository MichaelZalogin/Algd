package JavaCourseOCA.L22;

public class HomeworkL22 {
}

class Student3 {
    private StringBuilder name;
    private int course;
    private double grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 2) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 5) {
            this.course = course;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void show_info() {
        System.out.println("Имя " + getName() + " курс: " + getCourse() + " оценка: " + getGrade());
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student3 st1 = new Student3();
        StringBuilder ss1 = new StringBuilder("Ivan");
        st1.setCourse(3);
        st1.setGrade(4.5);
        st1.setName(ss1);
        st1.show_info();
    }
}