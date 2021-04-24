public class DZ5 {
    int id = 10;         // instance, переменные объекта относяться к каждому созданному объета
    String name = "KIM";
    double balance = 200;

    void popolnenie (double sumPopoln ) {
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс пополняется на: " + sumPopoln);
        balance += sumPopoln; // прибавить и присвоить  на сумму sumPopoln
        System.out.println("Баланс после пополнения: " + balance);
        System.out.println();

    }


    void snyatie (double sumSnyatie ) {
        System.out.println("Баланс до снятия: " + balance);
        System.out.println("Баланс уменьшится на: " + sumSnyatie);
        balance += sumSnyatie;
        System.out.println("Баланс после снятия: " + balance);
        System.out.println();

    }

}

class DZ5Test {

    public static void main(String[] args) {
        DZ5 MyBankAcc1 = new DZ5();
        MyBankAcc1.popolnenie(30.5);
        MyBankAcc1.snyatie(20.5);


    }
}
