
import java.util.*;

public class question {

    public static void main(String[] args) {

         System.out.println("ENTER TEH NNUMBER---");

     Scanner sc = new Scanner(System.in);
     int button = sc.nextInt();

    ////  pressing the button

     if ( button==1)
     {
        System.out.print(" HELLO ");
     }
     else if ( button==2)
     {
        System.out.print(" NAMASTE ");
     }
     else if(button==3)
     {
        System.out.print("BONJOUR");
     }
     else
      {
        System.out.println("INVALID BUTTON");
    }

}
}
