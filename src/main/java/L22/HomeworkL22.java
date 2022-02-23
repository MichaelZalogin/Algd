package L22;

public class HomeworkL22 {
}

class Student3 {
    private StringBuilder name;
    private int course;
    private double grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(this.name);
        return name2;
    }

    public void setName(StringBuilder n) {
        if (name.length() > 3) {
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
        System.out.println("Имя" + getName() + " курс: " + getCourse() + " оценка: " + getGrade());
    }
}


