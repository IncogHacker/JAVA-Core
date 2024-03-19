import java.util.*;

public class twodarray {

    public static void twoDarray() {

        // TAKING INPUT IN 2-D ARRAY BY GIVING THE VALUE ....ALREADY
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE ROW NO ");
        int row = sc.nextInt();
        System.out.print("\nENTER THE COL NO ");
        int col = sc.nextInt();

        int[][] rishabh = new int[row][col];
            
        // ************************************Giving input for the table *************
        ////Outer Loop
        for (int i=0; i<row; i++) {
        //Inner Loops..
            for (int j=0; j<col; j++) {

                rishabh[i][j]=sc.nextInt();
            }

        }
          //THIS IS THE OUTPUT 

          System.out.println("YOUR TABLE IS--\n ");
        for (int i=0; i<row; i++) {

            for (int j = 0; j<col; j++) {
             
                System.out.print(rishabh[i][j]+" ");
            }
             System.out.println();

    }
}

    public static void main(String[] args) {
        twoDarray();
    }
}