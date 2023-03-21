public class Car{
    int a;

    Car(int a){
        this.a = a;
    }

    public static void main(String[] args) {
        Car obj1 = new Car(10);
        System.out.println(obj1.a);
    }
}
