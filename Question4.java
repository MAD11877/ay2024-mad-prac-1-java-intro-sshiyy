import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    
    int i = in.nextInt();
    for (int row = i; row > 0; row--)
      {
        for (int column = 0; column < row; column++)
          {
            System.out.print("*"); // print
          }
        System.out.println();
      }
    
  }
}
