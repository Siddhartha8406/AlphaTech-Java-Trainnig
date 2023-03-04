class divisible {
    public static void main(String args[]){
        int i;
        for(i=1;i<=100;i++){
            String des = i%3==0? (i+" is divisible by 3"):(i+ " is not divisible by 3");
            System.out.println(des);
        }
    }
}
