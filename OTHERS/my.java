import java.util.*;

public class my {
    public static void main(String[] args)
    {
        /// using while and do while loop 
        int a;
        Scanner sc = new Scanner (System.in);

        System.out.print("please enter the number");
            
        a=sc.nextInt();
        do{
            System.out.println(" "+a);
            a++;
        }
        while (a<=20);
    }
}