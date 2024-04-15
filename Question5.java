import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
        Scanner in = new Scanner(System.in);

        
        int count = in.nextInt();

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            
            numbers[i] = in.nextInt();
        }

        int maxCount = 0;
        int mode = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int currentCount = 0;  
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = numbers[i];
            }
        }
        System.out.println(mode);
  }
}


