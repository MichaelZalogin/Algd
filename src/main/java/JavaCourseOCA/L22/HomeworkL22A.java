package JavaCourseOCA.L22;

public class HomeworkL22A {
}

class Student5 {
    private int course;
    private int grade;
    private StringBuilder name;

    public void setName(StringBuilder name) {
        if (name.length() < 3) {
            System.out.println("Имя не может быть менее трех символов");
        } else {
            this.name = name;
        }
    }

    public StringBuilder getName() {
        StringBuilder sb1 = new StringBuilder(name);
        return sb1;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4)
            this.course = course;
        else System.out.println("Курс должен находится в пределах от 1 до 4");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Оценка должна быть в диапазоне от 1 до 10");
        }
    }

    public void showInfo() {
        System.out.println("Студента зовут " + name
                + ", он учится на " + course + " курсе, его средняя оценка " + grade);
    }

    public static void main(String[] args) {
        Student5 st5 = new Student5();
        st5.setName(new StringBuilder("Ivan"));
        st5.setCourse(1);
        st5.setGrade(6);
        st5.showInfo();
    }
}