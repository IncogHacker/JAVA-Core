  
  import java.util.*;
  
  public class elseifc
{
    public static void main(String[] args)
    {
        float a , b;
          
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a");
        a=sc.nextFloat();
        System.out.println("enter B");
        b=sc.nextFloat();

        if ( a==b)
        {
            System.out.println(" Equal");
        }
        else if(a > b)
        {
            System.out.println("A is greater then a");
        }
        else if(a<b)
        {
            System.out.println(" A is smaller");
        }
        else 
        {
            System.out.println(" BYE");
        }
    }
}