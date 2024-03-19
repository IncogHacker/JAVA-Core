import java.util.*;
 public class practice {
  

        public static int  fibonaccIct (int input[] )
        {           
 
                int store=0;


                System.out.println("YOUR FIBONACCI SERIES :::");
              
                    for(int i=0; i<input.length-1; i++)
                    {
                          store=input[i]+input[i+1];

                                System.out.println(" "+store);
                       }


                        return store;
        }

        



 public static void main(String[] args)
 {
        Scanner sc= new Scanner(System.in);

        System.out.println("PLEASE ENTER THE length ");
        int n=sc.nextInt();
            int input[] = new int[n];
      int o=0;
        for(int i=0; i<input.length; i++)
        {
                System.out.println("ENTER THE " +o+  "  NUMBER");
         input[i]=sc.nextInt();
         o++;
        }


        fibonaccIct(input );


       

                  }

}
 