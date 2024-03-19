import java.util.*;
public class Q2 {
    public static void main(String[]args){
   
        int a=1,mul,i;
        Scanner sc = new Scanner(System.in);

                        //**************** PRINTING THE TABLE OF DIFFERENTS NUMBERS ********
 
        try{
             Thread.sleep(1000);
     
            
        
        System.out.print("PLEASE ENTER THE NUMBER WHICH YOU WANT TO PRINT THE TABLE---------");
        a=sc.nextInt();

        for ( i=1; i<=10; i++)
        {
            Thread.sleep(1000);
            
            mul=a*i;
            System.out.print(" "+a); System.out.print(" * "+i);

             System.out.print(" ");

           System.out.print(" = " +mul );

            System.out.print("\n\n");
        }
            
    }catch(Exception e){}

    }
    
}
