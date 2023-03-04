class oddeven{
    public static void main(String args[]){
        int i;
        for(i=1;i<=100;i++){
            String des = i%2==0? (i+" is even  number"):(i+ " is not even number");
            System.out.println(des);
        }
    }
}