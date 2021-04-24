import javax.swing.*;

public class Human {
    String name;
    Car3 car;
    BankAccount4 bA;
    void info() {
        System.out.println("Имя: " + name + " Цвет машины: " + car.color + " Баланс счета в банке: " + bA.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Ren";
        h.car = new Car3("red", "V8");
        h.bA = new BankAccount4(4, 200.5);
        h.info();
    }
}


class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }
    String  color;
    String engine;
}


class BankAccount4 {
    BankAccount4(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}