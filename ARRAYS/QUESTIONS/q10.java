
import java.util.*;

public class q10 {
    public static void main(String[] args) {
           
        Scanner sc =new Scanner(System.in);
        int row = sc.nextInt();
        
        int[]num = new int[row];

        for (int i = 0; i < row; i++)
         {
             num[i]=sc.nextInt();
         }
                 int target;
                 target=sc.nextInt();
             for(int i=0; i<row; i++)
               {
             for(int j=0; j<row; j++ )
            {
                   if(num[i]+num[j]==target)
                   {
                       System.out.print(" "+i+" "+j);
                   }
            }
        }
           
         

    }
}