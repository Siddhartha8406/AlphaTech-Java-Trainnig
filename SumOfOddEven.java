/*
 * Write a program to find the sum of odd and even numbers between 10 and 20
 */

public class SumOfOddEven {
    public static void main(String[] args) {
        int i = 10;
        int totalOdd = 0;
        int totalEven = 0;

        do{
            if(i%2==0){
                totalEven += i;
            }
            else{
                totalOdd += i;
            }
            i++;
        }while(i<=20);

        System.out.println("Sum of odd numbers: " + totalOdd);
        System.out.println("Sum of even numbers: " + totalEven);
    }
}
