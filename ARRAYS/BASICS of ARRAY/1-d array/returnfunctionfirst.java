import java.util.*;


public class returnfunctionfirst {
    

public static int[] arrayUserInput()
{

      Scanner sc = new Scanner(System.in);
    int[] marks = new int[4];

        int p,c,b,m;

    for(int i=1; i<=4;i++)
    {
           if(i==1){
    System.out.print("\nEnter The Number of PHYSICS-- ");
     p=sc.nextInt();
     marks[0]=p;
           } 

     if(i==2){
     System.out.print("\nEnter The Number of CHEMISTRY-- ");
    c=sc.nextInt();
     marks[1]=c;
     }

     if(i==3){
    System.out.print("\nEnter The Number of BIOLOGY--");
     b=sc.nextInt();
     marks[2]=b;
     }

     if(i==4){
     System.out.print("\nEnter The Number of MATH-- ");
     m=sc.nextInt();
     marks[3]=m;
     }
      }
      //int[] count={marks[0],marks[1],marks[2],marks[3]};

      return marks; 

     /// or also use return marks;

}
    public static void main(String[] args)
    {
     int [] count= arrayUserInput();
    System.out.print("\nPHYSICS --"+count[0]);
     System.out.print("\nCHEMISTRY--"+count[1]);
     System.out.print("\nBIOLOGY-- "+count[2]);
     System.out.print("\nMATHS--"+count[3]);

    }


}