/*
 * Write a program to check whether a given character is vowel or consonant using Switch case.
 */

import java.util.Scanner;
public class VowelOrConsonant_Switch {
    public static void main(String[] args) {
        System.out.print("Enter a letter");
        Scanner Scanner = new Scanner(System.in);
        char ch = Scanner.next().charAt(0);
        ch=Character.toLowerCase(ch);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch+" is a vowel");
                break;
            default:
                System.out.println(ch+" is a consonant");
                break;
        }
    }
}
