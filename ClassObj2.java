class A {
    public static void work(){
        System.out.println("A");
    }
}


class B{
    public static void display(){
        System.out.println("B");
    }
    
    public static void main(String[] args) {
        A.work();
        display();
    }
}