class SmallestOf2_ifElse {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int smallest;

        if (a<b)
            smallest = a;
        else
            smallest = b;

        System.out.println("Smallest of " + a + " and " + b + " is " + smallest);
    }
}
