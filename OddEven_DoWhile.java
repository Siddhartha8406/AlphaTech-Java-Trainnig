/*
 * Write a program that prints both odd and even the numbers from 50 to 100.
 */

public class OddEven_DoWhile {
    public static void main(String[] args) {
        int number = 50;
        do {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            }
            else{
                System.out.println(number + " is an odd number");
            }
            number++;
        } while (number <=100);
    }
}
