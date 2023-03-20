public class NoOfRep {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'a', 'd', 'e', 'a', 'a'};
        int total = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                total += 1;
            }
        }

        System.out.println("The charecter a is present " + total + " times in the array");
    }
}
