import java.util.*;

public class firstarray{

public static void arrayUserInput()
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

      System.out.print("\nPHYSICS --"+marks[0]);
     System.out.print("\nCHEMISTRY--"+marks[1]);
     System.out.print("\nBIOLOGY-- "+marks[2]);
     System.out.print("\nMATHS--"+marks[3]);

}


           ////  ********** SECOND WAY TO TAKE INPUT  ALSO TAKE INPUT OF ARRAY SIZE ****

           public static void secondInput()
           {
                Scanner sc= new Scanner(System.in);

                System.out.print("ENTER THE SIZE OF ARRAY ");
                int size =sc.nextInt();

                int[] marks= new int[size];
                int x=0;

              
                for(int i=0; i<size; i++)
                {
                  
                  System.out.print("ENTER THE " + (x++) + " NUMBER ");
                  marks[i]=sc.nextInt();
                }

                // OUTPUT
                int y=0;
                for(int i=0; i<size ; i++)
                {
                  System.out.print("\n YOUR " +y);System.out.print(" output is-- " +marks[i]);
                  y++;
                }




           }
    public static void arrayInput()
    {
        Scanner sc = new Scanner (System.in);

        /// Input of arrays

        int [] marks = new int[4];
              marks[0]=98;
              marks[1]=99;
              marks[2]=99;
              marks[3]=100;

             /// Isko itna likhne ke bjaye loop se output print kraa doo

        //System.out.print("BIOLOGY-- "+marks[0]);
       // System.out.print("\nPHYSICS --"+marks[1]);
        //System.out.print("\nCHEMISTRY--"+marks[2]);
       // System.out.print("\nMATHS--"+marks[3]);

        for(int i=0; i<=3 ;i++)
        {
          System.out.print(" \nYOURS MARKS -- " +marks[i]);
          System.out.print(" \n ");
        }
       
 
    }
    public static void main(String[] args)
    {


        secondInput();
       //arrayInput();
      // arrayUserInput();
    }


}