public class OddEven_Switch {
    public static void main(String[] args) {
        int num = 25;

        switch(num%2){
            case 0:
                System.out.println(num + " is even number");
                break;
            case 1:
                System.out.println(num + " is odd number");
                break;
        }
    }
}
