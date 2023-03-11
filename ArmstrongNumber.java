/*
 * Write a program to check if a number is Armstrong or not.
 */

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 407;
        int originalNumber = number;
        int total = 0;
        int armstongValue = 0;
        while (number != 0) {
            total += 1;
            number /= 10;
        }
        number = originalNumber;
        while(number != 0) {
                armstongValue += (int) Math.pow(number % 10, total);
                number /= 10;
        }

        if (originalNumber == armstongValue) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}
