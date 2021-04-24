public class Mehtod1 {
     int summa(int a, int b, int c) {
         int result = a+b+c;
         return result;

     }
}

class Test {
    public static void main (String[] args) {
        Mehtod1 m1 = new Mehtod1();
        int sum3 = m1.summa(1, 5, 50);
        System.out.println(sum3);


    }
}
