package javaCourseOCA.L22;

public class Person {

    private String name = "Ivan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected static int salary = 150;

    protected void work() {
        System.out.println("Working");
    }

    protected static void sleep() {
        System.out.println("Sleeping");
    }
}

class Student extends Person {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(Student.salary);
        s.work();
        Student.sleep();
        System.out.println(s.getName());
        s.setName("Petr");
        System.out.println(s.getName());
    }
}