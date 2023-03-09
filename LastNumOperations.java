public class LastNumOperations {
    public static void main(String[] args) {
        int i = 25;
        int lastdigit = i % 10;
        System.out.println(lastdigit);

        System.out.println("The last digit of " + i + ((lastdigit==2 && lastdigit==3)? " is divisible by 2 and 3" : " is not divisible by 2 and 3"));
    }
}
