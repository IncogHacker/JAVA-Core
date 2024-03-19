
import java.util.*;

public class Q5age {



   // public static boolean ageEligible(int age)
   /// {
           //   int x=18; 
              
          //    if(age >=x)
          //    {
           //     return true;
           //   }
           //     return false;
           //   }
            
             
  ///  }
   // public static void main(String[] arg)
  //  {
   //       Scanner sc = new Scanner(System.in);
         // int age ;
        // System.out.print("ENTER THE AGE ");
          //age=sc.nextInt();

           //  ageEligible(age);

             
           //  System.out.print(ageEligible(age));



                          //            *************** SAME program with different method .......

            public static String ageEligible(int age)
             {
                        int x=18 ; 
                        
                       
                       if(age >=x)
                       {
                         return " ELIGIBLE TO VOTE";
                       }
                       else{
                         return "NOT ELIGIBLE TO VOTE";
                       }
                     
                       
             }
             public static void main(String[] arg)
             {
                   Scanner sc = new Scanner(System.in);
                   int age ;
                  System.out.print("ENTER THE AGE--- ");
                   age=sc.nextInt();
         
                     ageEligible(age);
         
                      
                    //  System.out.print(" PERSON IS -- "+age);  ///wrong only prints age number not print eligible to vote

 
                       System.out.print("\nPERSON IS ----");
                       System.out.print(ageEligible(age));
    }
    
}
