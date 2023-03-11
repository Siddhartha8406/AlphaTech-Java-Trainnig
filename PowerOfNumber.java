public class PowerOfNumber {
    public static void main(String[] args) {
        int number = 2;
        int power = 2;
        int result = 1;
        int i = 1;
        do{
            result *= number;
            i++;
        }while(i<=power);
        System.out.println("Result: " + result);
    }
}
