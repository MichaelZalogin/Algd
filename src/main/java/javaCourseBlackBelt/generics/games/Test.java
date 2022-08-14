package javaCourseBlackBelt.generics.games;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Marya", 15);

        Students student1 = new Students("Nykoolay", 20);
        Students student2 = new Students("Ksenia", 18);

        Employee employee1 = new Employee("Petr", 32);
        Employee employee2 = new Employee("Michael", 29);

        Team<Schoolar> schoolarTeam = new Team<>("Dragon");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Students> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Rabotnik");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
    }
}