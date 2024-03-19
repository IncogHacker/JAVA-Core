 
 import java.util.*;
 
 public class check2
 {
    static String Black = "\u001b[30m";
    static String Red = "\u001b[31m";
    static String Green = "\u001b[32m";
    static String Yellow="\u001b[33m";
    static String Blue = "\u001b[34m";
    static String Magenta ="\u001b[35m";
    static String Cyon="\u001b[36m";
    static String White ="\u001b[37m";
    static String BrightBlack = "\u001b[30;1m";
    static String BrightRed ="\u001b[31;1m";
    static String BrightGreen ="\u001b[32;1m";
    static String BrightYellow = "\u001b[33;1m";
    static String BrightBlue= "\u001b[34;1m";
    static String BrightMagenta ="\u001b[35;1m";
    static String BrightCyan = "\u001b[36;1m";
    static String BrightWhite = "\u001b[37;1m";
    static String Reset="\u001b[0m";



 public static void main(String[] args)
 {

    int a , b;

      System.out.println(Red+" DECIDING GRETAER AND SMALLER NUMBER \n");

      System.out.println(Green+" \n PLEASE ENTER THE VALUE FOR 'A'---");

      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();

      System.out.println(Yellow+" \nPLEASE ENTER VALUE OF 'B'---");

      Scanner obj = new Scanner(System.in);
      b = obj.nextInt();
    

      /// USING DOUBLE STATEMENT INSIDE ELSE AND IF

          if(a > b)
          {
            System.out.println(Magenta+"\n 'A'  GREATER>>> 'B'");
          }
            else {
                if (b >a)
                {
                    System.out.println(Red+"\n'B' Greater>> 'A' or 'A' Smaller<< 'B'");
            }
                  else {   
                    if(a==b){
                    System.out.println(White+"\n'A'  EQUALT TO==     'B' ");
                        }
                    }
                  }

                  System.out.println(Reset+"END");

        }

    
 }


 
