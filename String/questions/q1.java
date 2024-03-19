import java.util.*;

public class q1 {

    public static void comBined() {

        Scanner sc = new Scanner(System.in);

        int size;
        System.out.print("ENTER THE LOOP RUN NUMBER : ");
        size = sc.nextInt();
        int totallength = 0;
        String[] input = new String[size];

        for (int i = 0; i < size; i++) {

            input[i] = sc.nextLine();

            totallength = totallength + input[i].length();

        }

        System.out.println("TOTAL LENGTH OF ARRAY STRING : " + totallength);

    }

    public static void apnaCollege() {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String array[] = new String[size];

        int totLength = 0;

        for (int i = 0; i < size; i++) {

            array[i] = sc.next();

            totLength += array[i].length();

        }

        System.out.println(totLength);

    }

    public static void mineInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THE SIZE TO RUN THE LOOPS :: ");
        int size = sc.nextInt();
        String array[] = new String[size];
        int x = 0;

        /// input
        for (int i = 0; i < size; i++) {
            System.out.print("\n ENTER THE " + x + "STRING :: ");
            x++;
            array[i] = sc.next(); ///if we write next line it will run one loop less only take input 3 time if we give size is 4
        }

        // output

        int totallength = 0;
        for (int i = 0; i < size; i++) {
            totallength += array[i].length();
        }

        System.out.println("\n TOTAL LENGTH OF STRING : " + totallength);
    }

    public static void main(String args[]) {

        // comBined();
        // apnaCollege();
        mineInput();

    }

}