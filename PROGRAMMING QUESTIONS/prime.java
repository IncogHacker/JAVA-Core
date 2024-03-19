import java.util.*;

public class prime {
    
    ///// CHECK NUMBER IS PRIME OR NOT .......
    public static void  priMe()
    {
        
        Scanner sc= new Scanner(System.in);
        int x;
        
        do{

            System.out.print("ENTER THE NUMBER: ");
        int n=sc.nextInt();
        int  count=0;
       
             for(int i=1; i<=n; i++)
             {
                if(n%i==0)
                
                  count++; 
                
             }
             if(count==2)
             {
                  System.out.print(" PRIME NUMBER \n ");
             }
             else
             System.out.print("NOT PRIME NUMBER \n ");


             System.out.print("DO YOU WANT TO CONTINUE PRESS 1: ");
             x=sc.nextInt();
             
            }
            while(x==1 || x!=0);
    }
     ///Give the target value and check the number is prime or not or prime number between two numbers....

    public static void prImetwo()
    {  
        Scanner sc=new Scanner(System.in);
        System.out.print("\n ENTER THE FIRST  NUMBER: ");
        int n1=sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER : ");
        int n2=sc.nextInt();
        int i,j;
        
          for(i=n1; i<=n2; i++)
          {
            for( j=2; j<=i; j++) /// j start with 2 coz 2 se start krenge check krna ki factors kitne aarhein
            {
                if(i%j==0)                 
                break;
                
            }
            if(i==j)
            System.out.print(" "+i);
          }
        
    }

    public static void primeThree()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n ENTER THE FIRST  NUMBER: ");
        int n1=sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER : ");
        int n2=sc.nextInt();
        int count=0;
        int i,j;
        
          for(i=n1; i<=n2; i++)
          {
            for( j=2; j<i; j++) /// j start with 2 coz 2 se start krenge check krna ki factors kitne aarhein
            {
            
                
            }
            if(count==2)
            System.out.print(" "+i);
          }
        
    }
    

    public static void main(String[] args)
    {
        //priMe();
       // prImetwo();
       //primeThree();
    }
}
                                                             