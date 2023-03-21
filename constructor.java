/*
 * Constructor
 */

class Car {
    int a;
    Car() {
        System.out.println(a);
    }

    public void display() {
        System.out.println("Display Method");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}    

