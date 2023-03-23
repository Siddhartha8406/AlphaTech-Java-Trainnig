class A {
    public static void display(){
        System.out.println("Display");
    }
}

class B extends A{
    public void work(){
        System.out.println("Work");
    }

    public static void main(String[] args){
        B b = new B();
        B.display();
        b.work();
    }
}