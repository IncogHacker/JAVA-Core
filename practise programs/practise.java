import java.util.*;
 
public class practise {

    public static void main(String[] args)
    {
        float a , b, result;
        char op, ch;
        Scanner sc = new Scanner(System.in);

        do{
            
         System.out.println("  select the operator to calculate +,,-,,/,,*");

         op=sc.next().charAt(0);

        
         if(op  == '+')
         {
         try{
          Thread.sleep(1000);
         System.out.print(" \n enter the addition");
           Thread.sleep(1000);
         System.out.println(" Please enter the firts number");
          a = sc.nextFloat();
         System.out.println(" please enter the second number");
         b= sc.nextFloat();
 
         result=a+b; 
         System.out.print(" your result is----  ");
         Thread.sleep(1000);
         System.out.print("  "  +result);
         }
         catch(Exception e){}

         }else if(op == '-')
                {
                    try{
                        Thread.sleep(1000);
                       System.out.print(" \n enter the subtraction");
                         Thread.sleep(1000);
                       System.out.println(" Please enter the firts number");
                        a = sc.nextFloat();
                       System.out.println(" please enter the second number");
                       b= sc.nextFloat();
               
                       result=a-b;
              
                       System.out.print(" your result is----  ");
                       Thread.sleep(1000);
                       System.out.print(" " + result);
                }catch(Exception e){}
            } else if(op == '*')
            {
                try{
                    Thread.sleep(1000);
                   System.out.print(" \n enter the multiplication");
                     Thread.sleep(1000);
                   System.out.println(" Please enter the firts number");
                    a = sc.nextFloat();
                   System.out.println(" please enter the second number");
                   b= sc.nextFloat();
           
                   result=a*b;
          
                   System.out.print(" your result is----  ");
                   Thread.sleep(1000);
                   System.out.print(" "+ result);
            }catch(Exception e){}

            }
            else if(op=='/')
            {
                try{
                    Thread.sleep(1000);
                   System.out.print(" \n enter the division");
                     Thread.sleep(1000);
                   System.out.println(" Please enter the firts number");
                    a = sc.nextFloat();
                   System.out.println(" please enter the second number");
                   b= sc.nextFloat();
           
                   result=a/b;
          
                   System.out.print(" your result is----  ");
                   Thread.sleep(1000);
                   System.out.print(" "+result);
            }catch(Exception e){}
            }

            try{
                Thread.sleep(500);
               }
               catch (Exception e){}
            System.out.println("Do you want to continue Y/N");
             ch= sc.next().charAt(0);

             } while(ch=='Y' || ch != 'N' );



    }
}