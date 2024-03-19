
import java.util.*;


public class conditional

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

    public static void main (String args[])

        {
             int age;
            System.out.print(Red+" Enter the age\n" );
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();

            if (age >18)
            {
                System.out.print(Green+" Adult student");
            }

            else {
                System.out.print(Red+"Not Adult");
        }




        }
    }

