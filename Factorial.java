/*
    * Write a program to find the factorial of a number.
 */

public class Factorial {
    public static void main(String[] args) {
        int i = 1;
        int fact = 1;
        while(i<=5){
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
    
}
