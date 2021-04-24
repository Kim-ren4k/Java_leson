// Любой класс это тип данных
public class BankAccount {

    int id;         // instance, переменные объекта относяться к каждому созданному объета
    String name;
    double balance;


    public static void main (String [] args){

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=12;
        MyAccount.name="Ren";
        MyAccount.balance=12.44;

        YourAccount.id=13;
        YourAccount.name="Mike";
        YourAccount.balance=15.00;

        HisAccount.id=14;
        HisAccount.name="Lex";
        HisAccount.balance=16.00;

        System.out.println(HisAccount.name);


    }
}

class BankAccountTest{
    public static void main (String [] args){

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=12;
        MyAccount.name="Ren";
        MyAccount.balance=12.44;

        YourAccount.id=13;
        YourAccount.name="Mike";
        YourAccount.balance=15.00;

        HisAccount.id=14;
        HisAccount.name="Lex";
        HisAccount.balance=16.00;

        System.out.println(HisAccount.name);




    }

}