class PolymorphismCTP {
    static int Add(int a, int b){
        return a+b;
    }
    
    static int Add(int a, int b, int c){
        return a+b+c;
    }

    static double Add(double a, double b){
        return a+b;
    }

    static void main(String[] args) {
        Add(10, 20);
        Add(10, 20, 30);
    }

}
