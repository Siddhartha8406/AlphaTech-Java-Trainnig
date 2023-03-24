class Employee{
    private int EId;
    private String Name;

    Employee(){}

    Employee(int EId, String Name){
        this.EId = EId;
        this.Name = Name;
    }

    public void work(){
        System.out.println(EId + "name is " + Name);
    }

    public void SetEId(int EId){
        this.EId = EId;
    }

    public int GetEId(){
        return EId;
    }

    public void SetName(String Name){
        this.Name = Name;
    }

    public String GetName(){
        return Name;
    }
}

class Boss{
    public static void display(Employee e){
        System.out.println("E-Id: " + e.GetEId());
        System.out.println("Name: " + e.GetName());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Rahul");
        display(e1);

        Employee e2 = new Employee(2, "Raj");
        display(e2);
    }
}