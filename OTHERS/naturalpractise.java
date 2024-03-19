import java.util.*;

public class naturalpractise{
     public static void main(String[] args)
     {

      
             int a,x ;
             char c;

             
      Scanner sc = new Scanner(System.in);
      

                do{
        System.out.print(" ENTER THE NUMBER YOU WANT THE TABLE ");
             
        a=sc.nextInt();
         

        for(int i=1 ; i<=10; i++)
        {
          try{
          Thread.sleep(1000);
          }catch(Exception e){}

         x=a*i;
         System.out.print(" "+a);
      System.out.print(" * "+i);    
      System.out.print( " = "+x);   
      System.out.print(" \n");

    }
    try{Thread.sleep(1000);
    }
    catch(Exception e){}
    
    System.out.print("YES OR NO ");
    c=sc.next().charAt(0);
    

   }while (c =='Y'|| c != 'N');
    
   
     }
} 