import java.uitil.*;


public class gcdmethod2{




public static int gcMethod2(int a,int b)
{
    int gcd;
    
  if (a%b==0) 
  return b;
return gcd(b,a%b);

}
 public static void main(String[] args)
 {

    Scanner sc= new Scanner (System.in);

    int a= sc.nextInt();
    int b=sc.nextInt();

    System.out.print(gcMethod2(a,b));

    
    
}
}

