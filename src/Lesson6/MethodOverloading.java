package Lesson6;

public class MethodOverloading {

    int sum() {
        int result = 0;
        System.out.println("Сумма " + result);
        return result;
    }

    int sum(int a, int f) {
        int result1 = a + f;
        System.out.println("Сумма " + result1);
        return result1;
    }

    int sum(int b) {
        int result3 = b;
        System.out.println("Сумма " + result3);
        return result3;
    }

    int sum(int a, int g, int r, int e) {
        int result4 = a + g + r + e;
        System.out.println("Сумма " + result4);
        return result4;
    }
}
class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        mO.sum();
        mO.sum(2, 955);
        mO.sum(4);
        mO.sum(4, 5,6,60);
    }
}

