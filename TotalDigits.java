/*
 * Write a program to print the sum of all the digits in the integer.
 */
public class TotalDigits {
    public static void main(String[] args) {
        int number = 1234567890;
        int total = 0;
        while (number != 0) {
            total += 1;
            number /= 10;
        }
        System.out.println("Total digits: " + total);
    }
}
