package L23;

public class OverridingHidingFinal {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        Doctor2 d1 = new Doctor2();
        Teacher2 t2 = new Teacher2();
        Driver2 dr2 = new Driver2();
        Employee2 e2 = new Doctor2();
    }
}

class Employee2 {
}

class Doctor2 extends Employee2 {
}

class Teacher2 extends Employee2 {
}

class Driver2 extends Employee2 {
}