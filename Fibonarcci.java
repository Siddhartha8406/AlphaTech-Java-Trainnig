/*
    * Write a program to find the fibonarcci of a number.
 */

public class Fibonarcci {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int k = 0;
        System.out.println(k);
        System.out.println(j);
        while(k<100){
            k = i + j;
            i = j;
            System.out.println(k);
            j = k;
        }
    }
}
