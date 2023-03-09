class decrement{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a--); // 10
        System.out.println(--b); // 9
        int c = a;
        System.out.println(c--); // 9
        System.out.println(--c); // 7
    }
}

class increment{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println(a++); // 10
        System.out.println(++b); // 11
        int c = a;
        System.out.println(c++); // 11
        System.out.println(++c); // 13
    }
}
