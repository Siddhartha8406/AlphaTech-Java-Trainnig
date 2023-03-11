/*
 *  Write a program to find the sum of first 10 even numbers.
 */

public class First10EvenSum {
    public static void main(String[] args) {
        int sum =0;
        int i=0;

        while(i<=10){
            sum += i*2;
            i++;
        }
        System.out.println("Sum of first 10 even numbers is: " + sum);
    }
}
