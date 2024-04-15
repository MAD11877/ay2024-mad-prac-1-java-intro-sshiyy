import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter integer: ");
    int integer =  in.nextInt();

    int ans = integer * integer;

    System.out.println("Result: " + ans);
  }
}
