package L5;

public class L5Homework {
}

class BankAccount {
    BankAccount (double balance){
        this.balance = balance;
    }
    int id;
    String name;
    double balance;

    double popolnenieScheta(double zachiclenie) {
        balance += zachiclenie;
        return balance;
    }

    double snyatieSoScheta(double snjtie) {
        balance -= snjtie;
        return balance;
    }

    void sostojanieScheta() {
        System.out.println(balance);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount cardholder = new BankAccount(13.4);
        cardholder.id = 12345;
        cardholder.name = "Ivan";
        cardholder.popolnenieScheta(10.1);
        cardholder.sostojanieScheta();
        cardholder.snyatieSoScheta(5);
        cardholder.sostojanieScheta();
    }
}
