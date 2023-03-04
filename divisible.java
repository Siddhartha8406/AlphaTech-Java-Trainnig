class divisible {
    public static void main(String args[]){
        int i;
        for(i=1;i<=100;i++){
            String des = i%7==0? (i+" is divisible by 7"):(i+ " is not divisible by 7");
            System.out.println(des);
        }
    }
}
