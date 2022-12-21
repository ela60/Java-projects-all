
package javaapplication9;





public class Problem {
  	  
    showBrackets(rows, columns);
  }

  // Draw rectangle of brackets with specified dimensions
  public static void showBrackets(int numRows, int numCols)
  {
    for(int i=1; i<=numRows; i++)
    {
      for(int j=1; j<=numCols; j++)
        System.out.print("[]");
      System.out.println();
    }
  }