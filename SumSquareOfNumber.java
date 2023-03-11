public class SumSquareOfNumber {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;
        do{
            total += i*i;
            i++;
        }while(i<=10);

        System.out.println("Sum of squares of first 10 numbers: " + total);
    }
}
