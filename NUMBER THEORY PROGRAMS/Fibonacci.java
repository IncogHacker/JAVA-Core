
import java.util.*;

public class Fibonacci {




    public static void fibonacCi(int x , int a, int b , int temp)
    {
        for(int i=2; i<=x; i++)
        {
            System.out.print(" " +b);
              
            temp=b;
              
            b=a+b;
        
            a=temp;
        
        }
        return ;


    }
public static void main(String [] arg)
{
     Scanner sc = new Scanner (System.in);

int a=0, b=1, temp=0;

System.out.print("Enter the Limit to print fibnonacci series--");
int x=sc.nextInt();

System.out.print(" " +a);

  fibonacCi(x,a,b,temp);

}


}