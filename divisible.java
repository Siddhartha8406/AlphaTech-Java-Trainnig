class divisible {
    public static void main(String args[]){
        int i;
        for(i=1;i<=100;i++){
            if(i%10==0){
                System.out.println(i+" is divisible by 3");
            }
            else{
                System.out.println(i+" is not divisible by 3");
            }
        }
    }
}
