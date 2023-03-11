/*
 * Write a program to find the sum of even numbers in a given number.
 */

public class SumOfEvenNumberInNumber {
    public static void main(String[] args) {
        int num = 12346;
        int total = 0;
        int i = 0;
        do{
            int lastDigit = num%10;
            if(lastDigit%2==0){
                total += lastDigit;
            }
            num = num/10;
            i++;
        }while(i<=20);
        System.out.println(total);
    }
}
