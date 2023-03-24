class tryCatch {
    int a = 10; 
    int b=0;
    String c;
    try{
        res = a/b;
    }
    catch(ArethmeticException e){
        System.out.println("Error: " + res);
    }
}
