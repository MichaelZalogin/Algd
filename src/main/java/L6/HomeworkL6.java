package L6;
public class HomeworkL6 { }
class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta(double a) {
        balance += a;
        return balance;
    }

    double snyatieSoScheta(double a) {
        balance -= a;
        return balance;
    }

    void showInfo() {
        System.out.println("Владелец банковского счета № " + id + " : " + name);
        System.out.println("Баланс лицевого счета:  " + balance + " USD ");
    }
}
class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.id = 32233;
        MyAccount.name = "Michael Zalogin";
        MyAccount.snyatieSoScheta(20.0);
        MyAccount.popolnenieScheta(43.4);
        MyAccount.snyatieSoScheta(12.3);
        MyAccount.showInfo();
        BankAccount HisAccount = new BankAccount();
        HisAccount.id = 349954;
        HisAccount.name = "Man1";
        HisAccount.popolnenieScheta(32.44);
        HisAccount.showInfo();
        BankAccount HerAccount = new BankAccount();
        HerAccount.id = 3443244;
        HerAccount.name = "Woman1";
        HerAccount.popolnenieScheta(544);
        HerAccount.showInfo();
    }
}
class Student {
    int id;
    String name;
    double economic;
    double language;
    double history;
    double znachenie;

    double Srednee(double economic, double language, double history) {
        double znachenie = (economic + language + history) / 3;
        return znachenie;
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student NewStudent = new Student();
        NewStudent.id = 12;
        NewStudent.name = "Petr";
        NewStudent.economic = 3.3;
        NewStudent.history = 5.0;
        NewStudent.language = 4.5;
        System.out.println("Студент " + NewStudent.name + " закончил обучение со средней арифметической оценкой - " +
        NewStudent.Srednee(3.3,5.0,4.5));
    }
}
class Employee {
    Employee (String s, String d, int i, int a, int sa){
        department = d;
        surname = s;
        id = i;
        salary = sa;
        age = a;
    }
    int id;
    String surname;
    int age;
    int salary;
    String department;
}
class EmpoyeeTest {
}