
import java.util.*;



public class pract{



public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);


  System.out.print(" ENTER THE ROW ");
  int row=sc.nextInt();
  System.out.print("ENTER THE COLUMN ");
  int col=sc.nextInt();

  int[][] matrix= new int[row][col];

  for(int i=0; i<row; i++)
  {
    for(int j=0; j<col; j++)
    {
        matrix[i][j]=sc.nextInt();
    }
  }

  int colstart=0;
  int colend=col-1;
  int rowstart=0;
  int rowend=row-1;

  while(colstart<=colend && rowstart<=rowend)   
  {
  for( col=colstart;     col<=colend;  col++)
  {
    System.out.print(" "+matrix[rowstart][col]);
  }
  rowstart++;
        
  for(row=rowstart; row<=rowend; row++)            
  {
    System.out.print(" "+matrix[row][colend]);
  }

  colend--;

  for(col=colend; col>=colstart; col--)  
  {
    System.out.print("  "+matrix[rowend][col]);
  }
  rowend--;
  for(  row=rowend;      row>=rowstart;  row--)         
  {
    System.out.print(" " +matrix[row][colstart]);
  }
  colstart++;
    }
}
}
