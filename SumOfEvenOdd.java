/*
 * Write a program to find the sum of even and odd numbers between 30 and 50.
 */

public class SumOfEvenOdd {
    public static void main(String[] args) {
        int i = 30;
        int sumEven = 0;
        int sumOdd = 0;

        while(i<=50){
            if(i%2==0){
                sumEven = sumEven + i;
            }else{
                sumOdd = sumOdd + i;
            }
            i++;
        }

        System.out.println("Sum of even numbers is: " + sumEven);
        System.out.println("Sum of odd numbers is: " + sumOdd);
    }
}
