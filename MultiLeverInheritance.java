class A {
    public void display(){
        System.out.println("From A()");
    }
}

class B extends A{
    public void display1(){
        System.out.println("From B()");
    }
}

class c extends B{
    public void work(){
        System.out.println("From C()");
    }

    public static void main(String[] args){
        c c = new c();
        c.display();
        c.display1();
        c.work();
    }
}