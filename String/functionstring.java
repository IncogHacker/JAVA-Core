import java.util.*;

    
public class functionstring {

    public static void stringCompare()
    {

        Scanner sc =new Scanner (System.in);
        String n, x;
        System.out.println(" \n First Name::");
        n=sc.nextLine();
        System.out.println("Second Name : ");
        x=sc.nextLine();
        
        //// COMPARE TO FUNCTION (compareTo is a function)
            //1 s1 > s2 : +value
            //2 s1 < s2 : - value
            //3 s1 = s2 : 0 

        if (n.compareTo(x) == 0)  // comparing first string to another 
        {
            System.out.println(" Equal");
        }else{
            System.out.println("\n NOT EQUAL");}

 
            if (n.compareTo(x) == '+')  // comparing first string to another 
            {
                System.out.println("\n First String > SECOND ");
            }else{
                System.out.println("\n Second String > First String");}


    
                if (n.compareTo(x) == '-')  // comparing first string to another 
                {
                    System.out.println("\n First String < SECOND ");
                }else{
                    System.out.println("\n Second String > First String");}
        

            // if (n==x)  // comparing first string to another by using only(==)  it fails in many cases thats why use the compareTo function
            // {
            //     System.out.println(" Equal");
            // }else{
            //     System.out.println("NOT EQUAL");}


            
        // if (new String("Tony") == new String("Tony"))  // comparing first string to another  with another which is wrong ..
        // {
        //     System.out.println(" Equal");
        // }else{
        //     System.out.println("NOT EQUAL");}
    }



public static void subsTring()
{
    Scanner sc = new Scanner (System.in);
    // String sent1 = "MY Name IS RISHABH";

    // String name1 = sent1.substring(11,sent.length());
    //  System.out.println(name); //PRINT RIshabh onlyy 

        // String sent2 = "TonyStark";
        // String name2= sent2.substring(0,4); // 0(T) 1(o) 2(n) 3(y) 4(S) 

        // System.out.println(name2); // print Tony 

        String sent3 = "TonyStark";
        String name3= sent3.substring(4);

        System.out.println(name3); // Stark
}


public static void parseInt()
{
     
    ///Integer.parseInt(str); convert string  to integer.

            // String str = "Rishabh";
     
            // int number = Integer.parseInt(str);
     
            // System.out.println(number);


            // Example

            Scanner sc= new Scanner(System.in);

            String input ;
                 
            System.out.println("ENTER THE PRICE");
            input=sc.nextLine();

            int  output= Integer.parseInt(input);

            System.out.println("\n PRICE IS :"+output);

     
}



public static void tosTring()
{
    // int number = 123;

    // String str = Integer.toString(number);

    // System.out.println(str.length());

  int number = 421;

  String name= Integer.toString(number);

  System.out.println(" "+name);

}


    public static void main(String[] args)
    {
       //stringCompare();
       //subsTring();
       //parseInt();
        tosTring();  //Function
        

    }
    
}

