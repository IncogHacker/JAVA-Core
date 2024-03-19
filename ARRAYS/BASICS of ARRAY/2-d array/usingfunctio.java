import java.util.*;

public class usingfunctio {




    public static int[][] functionReturn( int row , int col)
    {

        Scanner sc=new Scanner(System.in);

        int[][] matrix = new int[row][col];

        for(int i=0; i<row; i++)
        {
          for(int j=0; j<col; j++)
          {
              matrix[i][j]=sc.nextInt();
          }
        }
        

           return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       

        System.out.print("ENTER THE ROW ");

       int row = sc.nextInt();

        System.out.print("ENTER THE COLUMN");
         int col = sc.nextInt();

         

      int[][] matrix= functionReturn(row,col);

      for(int i=0; i<row; i++)
      {
        for(int j=0; j<col; j++)
        {
            System.out.print(" "+matrix[i][j]);
        }

        System.out.print("\n");
      }  

      
    }
}
