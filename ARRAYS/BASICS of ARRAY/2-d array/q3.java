import java.util.*;

public class q3 {
    


    public static void tranSpose()
    {
             Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the row ");
            int row = sc.nextInt();
            
            System.out.println(" Enter the column");
            int col = sc.nextInt();

            int[][] matrix=new int [row][col];

            for(int i =0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                {
                    matrix[i][j]=sc.nextInt();
                }
            }
            

                System.out.println("\n YOUR Transpose is ---\n");
                
            for(int i =0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                {
                    System.out.print(" "+ matrix[j][i]);
            }
                     System.out.print("\n");
        }
    }


    public static void tranSposetwo()
    {
        Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int m = sc.nextInt();


      int matrix[][] = new int[n][m];

      for(int i=0; i<n; i++) {

           for(int j=0; j<m; j++) {

               matrix[i][j] = sc.nextInt();

           }

      }


      System.out.println("The transpose is : ");

      //To print transpose

      for(int j=0; j<m ;j++) {

          for(int i=0; i<n; i++) {

              System.out.print(matrix[i][j]+" ");

          }

          System.out.println();

      }

   }

    public static void main(String[] args)
    {
        //tranSpose();
        tranSposetwo();
    }
}
