class A{
    public void display()
    {
        System.out.println("This is class A");
    }
}

class methodOverriding extends A{
    public void display(){
        System.out.println("This is class methodOverriding");
    }

    public static void main(String[] args) {
        methodOverriding obj1 = new methodOverriding();
        obj1.display();
        A obj2 = obj1;
        obj2.display();
    }
}