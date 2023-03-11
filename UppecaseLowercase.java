import java.util.Scanner;

public class UppecaseLowercase {
    public static void main(String[] args) {
        System.out.print("Enter a letter");
        Scanner Scanner = new Scanner(System.in);
        char ch = Scanner.next().charAt(0);
        String des = (ch>='A' && ch<='Z')? "upper":"lower";
        switch(des){
            case "upper":
                System.out.println(ch+" is an uppercase letter");
                break;
            case "lower":
                System.out.println(ch+" is a lowercase letter");
                break;
            default:
                System.out.println(ch+" is not a letter");
                break;
        }
    }
}
