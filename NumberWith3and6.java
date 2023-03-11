/*
 * Write a program to print all the numbers from 20 to 50 which contains 3 or 6 at the end of it.
 */

public class NumberWith3and6 {
    public static void main(String[] args) {
        int num = 30;
        int i = 20;
        while (i<=50){
            if(i%10==3 || i%10==6){
                System.out.println(i);
            }
            i++;
        }
    }
}
