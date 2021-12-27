package L4;

public class L4 {
}

class BankAccount {

    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name = "Michael";
        MyAccount.balance = 12.35;

        YourAccount.id=2;
        YourAccount.name = "Mike";
        YourAccount.balance = 3.00;

        HisAccount.id=3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 132.12;

        System.out.println(MyAccount.id);
        System.out.println(YourAccount.id);
        System.out.println(HisAccount.id);
        System.out.println(HisAccount.id);
        System.out.println(HisAccount.id);
    }
}