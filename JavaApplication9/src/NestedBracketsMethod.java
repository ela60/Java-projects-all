import java.util.Scanner;

public class NestedBracketsMethod
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int height,width;

    System.out.print("How many rows do you want?");
    height= scan.nextInt();

    System.out.print("How many columns do you want?");
    width = scan.nextInt();
    for(int i = 1; i <= height; i++)
{
   for(int j = 1; j <= width; j++)
   {
      System.out.print("*");
   }
   System.out.println();
}
}
}