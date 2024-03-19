
import java.util.*;
public class q1twoD {

    public static void quesTion()
    { 
        Scanner sc= new Scanner(System.in);
          
        int row, col;

         System.out.print("ENTER THE ROW " );
        row=sc.nextInt();
        System.out.print("ENTER THE COLUMN ");
        col=sc.nextInt();

            int[][] matrix = new int[row][col];

            for(int i=0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                {
                    matrix[i][j]=sc.nextInt();
                }
            }
       System.out.print("\n PLEASE ENTER THE NUMBER YOU WANT TO SERACH FOR ");
       int number=sc.nextInt();
       
       
       for(int i=0; i<row; i++)
       {
           for(int j=0; j<col; j++)
           {
             if(matrix[i][j]==number)
             {
                System.out.println(" "+ i +" "+j);
             }
           }
       }
    }

    public static void main(String[] args)
    {
        quesTion();
    }
}