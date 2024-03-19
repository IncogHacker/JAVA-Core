import java.util.*;

public class q2 {

    public static void stringQ2() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" GIVE INPUT AS A SIZE ");
        int size = sc.nextInt();
        int i;

        String[] array = new String[size];

        System.out.println("\n ENTER THE STRING ");
        for (i = 0; i < size; i++)

        {

            array[i] = sc.next();
        }

        System.out.println("*********** YOUR INPUTS ARE  ***********");
        for (i = 0; i < size; i++)

        {
            System.out.println(+i + "-" + array[i]);
        }

        System.out.println("\n PLS SELECT THE STRING TO REPLACE ");
        String select;
        select = sc.next();
        String store = "";

        for (i = 0; i < size; i++) {

            // ****we can use both the way to compare the strings */

            // if(array[i].compareTo(select)==0)
            if (array[i].equals(select)) {
                System.out.println(" ******   YOUR  STRING PRESENT IN ARRAY STRING  " + i + "::" + select);
                store = select;

            } else {
                System.out.println(" ******  YOUR SELECTED STRING NOT PRESENT IN ARRAY STRING ::" + i);

            }

        }
        System.out.println("\n ENTER THE LETTER fROM SELECTED STRING To Replace:: ");
        String x = sc.next();

        System.out.println("\n ENTER THE LETTER YOU WANT TO REPLACE WITH SELECTED LETTER FROM STRING ::");
        String y = sc.next();
        String result = "";

        for (i = 0; i < store.length(); i++) {
            if (store.charAt(i) == x.charAt(0)) {
                result = result + y;
            } else {
                result = result + store.charAt(i);
            }

        }

        System.out.println("\n AFTER REPLACEMENT YOUR STRING IS ::" + result);

    }

    public static void seconDstring()
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE STRING ::");
          String array=sc.nextLine();
          
          String result="";
          for(int i=0; i<array.length(); i++)
          {
            if( array.charAt(i)== 'e')
                 result= result + 'i';
                 else{
                    result=result+array.charAt(i);
                 }
          }
             
          System.out.println(" "+result);

    }

    public static void main(String[] args) {

        // stringQ2();
        seconDstring();
    }

}
