import java.util.*;

public class q6function{

   

    public static int[] countNo(int x)
    {

        Scanner sc= new Scanner(System.in);

        int n=0 , positive=0 , negative =0, zeros=0;
        while(x==1)
        {
             n++;
             System.out.print("PLEASE ENTER THE " +n); System.out.print(" NUMBER ");
              float c=sc.nextFloat();

             if (c > 0)
              
            positive++;

             else if(c < 0)
              
              negative++;

             else if(c==0)

              zeros++;

             System.out.print("PRESS 1 FOR CONTINUE AND 0 FOR END ");
             x=sc.nextInt();
     
          
        }
        int[] count ={positive , negative ,zeros};
        return count;
     }
    public static void main(String [] args)

    {
        Scanner sc =new Scanner(System.in);
        int x;
        System.out.print("PRESS 1 FOR CONTINUE AND 0 FOR END ");
        x=sc.nextInt();

         
           int[] count = countNo(x);


          System.out.print("POSITIVE ---"+count[0]);
          System.out.print("NEGATIVE ---"+count[1]);
          System.out.print("ZEROS ---"+count[2]);

          System.out.print("PRESS 1 FOR CONTINUE AND 0 FOR END ");
          x=sc.nextInt();
  
    }
    }

    


   
   