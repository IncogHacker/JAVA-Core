
import java.util.*;

public class age {



    public static int ageEligible(int age)
    {
               int x=18; 
              
              if(age >=18)
              {
                return true;
              }
              else{
                return false;
              }
            
              
    }
    public static void main(String[] arg)
    {
          Scanner sc = new Scanner(System.in);
          int age ;
         
          age=sc.nextInt();


             ageEligible(age);

             System.out.print(" THIS PERSON ELIGBLE FOR VOTING Age is --"+age);
             System.out.print("THIS PERSON NOT ELIGIBLE FOR VOTING Age is--"+age);

    }
    
}
