import java.util.Scanner;
import java.util.Arrays;  ///prededined class  toString method in Array pacakage

public class Arraystostring {


    public static void arrayTostring()
    { 
        String input[]= {"1 ", "Priya" , "Shikha" , "Sohan" , " rekha "};

        System.out.println("\n TO STRING :"+Arrays.toString(input)); ///convert input array into string representation..

        System.out.println("\n As list :"+Arrays.asList(input)); //  to string work with integer value but as list not work with integer value -- It prints the garbage value .......
        
        

         //System.out.println("TO STRING : "+input); // gives  garbage value ([Ljava.lang.String;@372f7a8d)



         int input2[] ={1,2,3,4,5,5};

         System.out.println("\n As List 2:"+Arrays.asList(input2)); //print garbage value

    }

    public static void deePtostring()  

    { 
        String input[][]={{"rishbh,shikha"},{"riya ,rishabh"}};

    System.out.println("\n deep to string:::::"+Arrays.deepToString(input)); ///work with 2d arrays 
      

    int[][] input2={{1,2},{2,3},{4,5}};

    System.out.println("\n INTEGRE deep To String::::"+Arrays.deepToString(input2));
    }



    public static void main(String args[])
    {
           // arrayTostring();
            deePtostring();  // accept 2-d array
    }
    
}
