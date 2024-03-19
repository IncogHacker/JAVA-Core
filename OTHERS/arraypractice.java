import java.util.*;
 public class arraypractice {
  
    
public static int[] retuRn(int array[] )
{
  int pos=0 , neg=0 ,zero=0; 

         for(int i=0; i<array.length; i++)
         {
                 if(array[i]>0)
                 {
                  pos++;
                 }else if( array[i]<0)
                 {
                  neg++;
                 }
                 else if(array[i]==0)
                 {
                  zero++;
                 }
         }

        int result[] ={pos , neg , zero};

        return result;

         
}


  public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
           
        int size;
        size=sc.nextInt();
       int array[] = new int[size];
            int x=0;
       for(int i =0 ; i<array.length ; i++)
       {

        System.out.print("Enter the " +x+ "  VAlue ");
              array[i]=sc.nextInt();
       }
          
       
            int [] result = retuRn(array);

           System.out.println("POSITIVE ---"+result[0]);
          System.out.println("NEGATIVE ---"+result[1]);
          System.out.println("ZEROS ---"+result[2]);
  }

  


    }
 
 