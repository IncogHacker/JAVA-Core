
import java.util.*;

public class Q1 {

    public static void main(String[] args){
        
        //// PRINT THE SUM OF N NATURAL NUMBERS

         int n ,sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NATURAL NUMBER FOR SUM  ");
           n=sc.nextInt();
            
           do{
             
            sum=sum+n;
            n++;
            

           }
      
           while(n<=10);
           System.out.println(" "+sum);

              //// PRINT THE SUM OF N NATURAL NUMBERS USING FOR LOOP

         //     for(int i=0; i<=n; i++)
           //   {
                
             //   sum= sum +i;

              //}System.out.println("AFTER THE TOTAL SUM YOUR RESULT IS --" +sum);
               

    }


    
}
