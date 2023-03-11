/*
 * Write a program to find the sum of all odd numbers between 10 and 20.
 */
public class SumOfOddNumber {
    public static void main(String[] args) {
        int i = 10;
        int total = 0;
        do{
            if(i%2!=0){
                total += i;
            }
            i++;
        }while(i<=20);
        System.out.println(total);
    }
}
