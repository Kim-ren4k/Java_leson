class test2 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a-- - --a + ++a + a++ +a);
        int b = 8;
        System.out.println(++b - b++ + ++b - --b);

    }
}


class test3 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a-- - --a + ++a);
        int b = 8;
        System.out.println(++b - b++ + ++b);

    }
}
