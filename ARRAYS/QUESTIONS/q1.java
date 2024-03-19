import java.util.*;


/// Q 1-- take an array as input from the user . search for a given number x and print the index at which it occurs.. 

public class q1 {

    public static void quesTion()
    {
 
          System.out.print("ENTER THE SIZE OF ARRAY ");
          Scanner sc= new Scanner(System.in);
          int size= sc.nextInt();

          int[] number= new int[size]; /// number is a array
               int x=0;
         for(int i=0; i<size; i++)
         {
            System.out.print("ENTER THE NUMBERS ---"+(x++)+ "  ");
            number[i]=sc.nextInt();
         }
            for(int j=0; j<size; j++)
            {
                System.out.print("\n Your number are "+number[j]);
                System.out.print("\n");

            }
            int search;
            System.out.print("\nENTER THE NUMBER YOU WANT TO SEARCH FOR ");
            search=sc.nextInt();
              
                 ////we can take both i and j its not matter 

            for(int i=0; i<size; i++) /// ye bhi likh saktein hain for(i=0; i<number.length; i++)
            {
                if(search==number[i])  ////  or if(number[i]==search)
                {
                  System.out.print("Your index number of array is or Search is found at index number --- "+i);
                }
            }
         
    } 

    public static void main(String[] args)
    {
        quesTion();
    }
    
}
