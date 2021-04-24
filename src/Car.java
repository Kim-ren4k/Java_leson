public class Car {
    String color;
    String engine;
    int speed;


    int gaz(int skorost) {
        speed+=skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed-=skorost;
        return speed;

    }

    void showInfo() {
        System.out.println("cvet: " + color + " motor: " + engine + " skorost: " + speed);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "red";
        c.engine = "v6";
        c.speed = 60;
        c.showInfo();

        c.gaz(20);
        c.showInfo();

        c.tormoz(80);
        c.showInfo();

    }

}





