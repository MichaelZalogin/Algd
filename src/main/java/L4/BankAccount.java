package L4;
public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Ivan";
        myAccount.balance = 33.4;
        System.out.println(myAccount.balance);

        hisAccount.id = 2;
        hisAccount.name = "Petr";
        hisAccount.balance = 343.6;
        System.out.println(hisAccount.name);

        yourAccount.id = 3;
        yourAccount.name = "Michael";
        yourAccount.balance = 33.3;
        System.out.println(yourAccount.id);
    }
}