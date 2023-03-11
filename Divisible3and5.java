/*
 * Write a program to check if a number is divisible by 3 and 5.
 */

public class Divisible3and5 {
    public static void main(String[] args) {
        int num  = 30;
        String des = (num%3==0 && num%5==0)? ("Hi"):("Bye");
        System.out.println(des);
    }
}
