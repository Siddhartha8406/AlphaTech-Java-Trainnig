class Car {
    int a;
    String name;

    Car(int a, String name) {
        System.out.println(a+" "+name);
    }

    public static void main(String[] args) {
        Car c = new Car(10, "BMW");
    }
}
