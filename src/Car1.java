public class Car1 {
    Car1(String cvet, String motor) {
        color = cvet;
        engine = motor;

    }
    String color;
    String engine;
}

class CarTest1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1("red", "v8");
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}

