public class CheckRep {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'a', 'd', 'e', 'a', 'a'};
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                System.out.println("The charecter A is present in the array");
                break;
            }
        }
    }
}
