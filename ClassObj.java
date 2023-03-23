class A {
    public void work(){
        System.out.println("A");
    }
}


class B{
    public void display(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.work();
        
        B obj2 = new B();
        obj2.display();
    }
}