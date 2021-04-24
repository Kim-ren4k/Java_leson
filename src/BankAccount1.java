
public class BankAccount1 {

    int summa(int a, int b, int c) {
        int result=a+b+c;
        return result;
    }
    int sreneeAifm(int a1, int b1, int c1) {
        int result2 = summa(a1,b1,c1)/3;
        return result2;
    }
}

class Test4 {
    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1();
        int summaChisel = b1.summa(1,2,2);
        System.out.println(summaChisel);
        System.out.println(b1.summa(8,2,2));
        System.out.println(b1.sreneeAifm(20,40,60));



    }

}
