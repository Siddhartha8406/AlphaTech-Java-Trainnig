public class OddArray10 {
    public static void main(String[] args)
     {
        int[] numbers=new int[10];
        //var numbers = new int[10];
        int i;
        int j = 0;
        
        for(i=1; j < numbers.length; i++) {
            if (i % 2 != 0) {
                numbers[j] = i;
                j++;
            }
        }

        for (i = 0; i < numbers.length; i++)
         {
            System.out.println(numbers[i]);
        }
    }
}
