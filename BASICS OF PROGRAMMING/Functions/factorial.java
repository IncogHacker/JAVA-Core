import java.util.*;

public class factorial{

        public static int factNumber(int x ){

             int factor=1, y=x;

             if(x<0){
             System.out.print("INVALID NUMBER");

               return x;
             }

             System.out.print("FACTORIAL OF " +x);System.out.print(" = ");

            for( int i=1; i<=x ; x-- )
            {
               
                factor = factor*x;
                  if (x==1)
                System.out.print(x+"  ");
                else
                System.out.print(x+" * ");

            }
            return factor;
        }


    public static void main(String[] arg){

        Scanner sc =new Scanner(System.in);

        System.out.print("ENTER THE NUMBER FOR FACTORIAL ");
        int x = sc.nextInt();
          
            
          int factor=factNumber(x);


         
        System.out.print(" = " +factor);

    }
}