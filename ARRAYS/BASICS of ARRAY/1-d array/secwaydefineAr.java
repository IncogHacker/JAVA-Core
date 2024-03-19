import java.util.*;

public class secwaydefineAr {
    

    public static void secondWaydefinearray()
    {

        int[] marks={87,87,90};

        for(int i=0; i<=2; i++)
        {
        System.out.print(" "+marks[i]);
        System.out.print("\n");
        }
       
    }
public static void userInputsizeofarray()
{
    Scanner sc= new Scanner(System.in);
    int size=sc.nextInt();

    int marks[]= new int[size];

    for(int i=0; i<=size; i++)
    {
       //// System.out.print(" "+marks); OUTPUT of this is garbage value .....
       System.out.println(marks[i]);
    }

}
    public static void main(String[] args)
    {

        userInputsizeofarray();
        // secondWaydefinearray();
    }
}
