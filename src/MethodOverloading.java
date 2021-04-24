// Method Overloading позволяет давать общее название методам, имена и параметры должнеы быть разные, или несколько чтобы компилятор понимал какой метод брать
// Перезагруженные методы имеют одинаковые имена и разный список парметров
public class MethodOverloading {

    void show(int i1) {                    // метод showInt
        System.out.println(i1);
        System.out.println("Data Type is int");

    }
    void show(int a, int f) {
        System.out.println(a);
        System.out.println("Data Type is int");
    }
    void show(boolean b1) {                 // метод showBoolena
        System.out.println(b1);
        System.out.println("Data Type is boolean");
    }
    void show(String s) {                   // метод showString
        System.out.println(s);
        System.out.println("Data Type is string");

    }
    void show(String s, int a) {
        System.out.println("String: " + s +" "+ "int: " + a);

    }
    void show(int a, String s) {
        System.out.println("int a, String s");

    }
}
 class MethodOverloadingTest {
     public static void main(String[] args) {
         MethodOverloading mO = new MethodOverloading();    // создаем объект class MethodOverloading
         int a = 500;
         mO.show(a);                                         // вызываем его метод showInt
         boolean b = true;
         mO.show(b);                                         // вызываем его метод showBoolena
         String s = "HI";
         mO.show(s);                                         // вызываем его метод showString
         mO.show("Hi", 20);
     }

 }

