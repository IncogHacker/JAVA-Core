
import java.util.*;

public class GCDmethod1 {




    public static int gcdMethod1(int n1 , int n2 )
    {
              int gcd;

        while (n2 != 0) { ////n2 jab tak 0 ke equal nhi hoga tab tak run krega ......
 
            int temp = n2;  //temp = 12;
    
            n2 = n1 % n2;  ///n2= 33 % 12 --  n2 = 9
    
            n1 = temp;  /// n1=12 ....continue till n2 =0;
        }
         return gcd = n1;

          
    }
public static void main(String[] args)
{
    //Scanner sc= new Scanner(System.in);
    

    Scanner sc = new Scanner(System.in);
    int n1, n2;

    System.out.print("ENTER THR FIRST NUMBER-- ");
    n1 = sc.nextInt();  /// 33

    System.out.print("\n ENTER THE SECOND NUMBER--");
    n2 = sc.nextInt();   /// 12 
   
    
      int gcd =gcdMethod1(n1,n2);

    System.out.println("\n Greatest common divisor  is: " + gcd);
    


    }
    
}
