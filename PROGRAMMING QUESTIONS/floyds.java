import java.util.*;


public class floyds{

    public static void main(String[] args)
    {
                     Scanner sc= new Scanner(System.in);
                     int i=sc.nextInt();
                     int number=1;
                      
        for(int row=1 ; row <= i ; row ++)
        {
            for(int col=1; col <=row; col ++)

            {
               
                    System.out.print(number+" ");
                    number++;
             
            

            }   
            

            System.out.println(" ");
        }

    
                                   
        
    }
}
