import java.util.*;

public class check 

{

    public static void main(String[] args)
    { 
        int a;

        System.out.println(" ENTER THE NUMBER \n\n" );

         Scanner sc = new Scanner(System.in);
          a = sc.nextInt();

          if ( a % 2 == 0)
          {
            System.out.print(" \n THE NUMBER IS EVEN NUMBER");
          }
          else
          
          {
            System.out.println(" THE NUMBER IS ODD NUMBER ");

          }

    }      
}