import java.util.*;

public class practise {

    public static void main( String[] args)
    {
        int num1 ,num2 ,sum ,select;
        char option;
        Scanner sc= new Scanner (System.in);
    try{
    Thread.sleep(1000);
    }
      catch(Exception e){} 

        System.out.print("  CALCULATOR \n ");

        option = sc.next().charAt(0);


         
        if(option=='+')
        {
            try{
                Thread.sleep(100);

             System.out.print(" ADDITION \n ");
                Thread.sleep(1000);
             
             System.out.print("Enter the first number");
             num1 = sc.nextInt();
             System.out.print("Enter the second number");
             num2 =sc.nextInt();
              
             sum=num1+num2;
        
            Thread.sleep(1000);
             System.out.print("your result"+sum);



        
             }catch(Exception e){
            System.out.print(e+ " ");
        }
    }
        else if(option == '-')
        {
            System.out.print("SUBTRACTION \n");
            num1=sc.nextInt();

            num2=sc.nextInt();

                sum= num1 -num2;

            System.out.print("your result "+sum);
        

        }else if( option == '%')
        {
            System.out.print("     FIND %  AND  EVEN OR ODD \n ");
               
            System.out.print("  FISRT NUMBER ENTER-----");

                num1=sc.nextInt();

          System.out.print("  \n ENTER THE SECOD NUMBER-----");

                num2=sc.nextInt();

                ///////////////////////IF WHOLE STATEMENT //////////////////////


            if( num1% 2 == 0 )
                   
                System.out.print("\n YOUR FIRST SELECTED NUMEBR IS EVEN");
             
            if(num2% 2 ==0)
            
                System.out.print("\n YOUR SECOND SELECTED NUMBER IS EVEN  ");
                
            if (num1 % 2 !=  0)

            System.out.print("\n YOUR FIRST SELECTED NUMBER IS ODD ");
             
            if(num2 % 2 != 0)
              {

            System.out.print("\n YOUR SECOND SELECTED NUMBER IS ODD ");
        
                 }       else
                
            
            System.out.print("\n \n IF you want the result of % press %---");

            select=sc.next().charAt(0);

            if (select == '%') 
            {
                System.out.print("\n And the result of % is---- ");
        }
            sum=num1 % num2;

                 System.out.print("result-----"+sum);


                 

        }
    }
}
