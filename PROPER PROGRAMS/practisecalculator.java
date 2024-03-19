import java.util.*;


 
public class practisecalculator{

        
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


    public static void main(String[] args){
 
        char op,selection,ch;
        float num1,num2 ,R;
          Scanner sc= new Scanner(System.in); 
          
        System.out.println( Green + "      \n      ********ENTER THE WORLD OF CALCULATOR*********         " );

                  /// ***USING SLEEP METHOD HELP OF TRY AND CATCH

                 
                 try{
                Thread.sleep (1000);}
                catch(Exception e){}
               
            
                /////// ********** TAKING INPUT AND SELECTING OPERATORS ********

                do{


                System.out.println( Red + " \n PLEASE SELECT THE OPERATOR---  + , - , * , /");

                               op = sc.next().charAt(0);    /// charcater input


                    //// ******ACTIONS ON OPERATORS********

                      System.out.print(White+ "    YOUR SELECTED OPERATOR IS>>>>>>>>>>>>>> " );

                     try{
                        Thread.sleep(1000);   }
                        catch(Exception e){}                                                                      
                   
                  
                  if ( op == '+') {

                      System.out.println("ADDITION OPERATOR (+) "); 

                      try{
                        Thread.sleep(1000);

                    System.out.println(Red+ " \n           ......  PROCESSING ......."             );

                            ///// VALUES     
                            
                        Thread.sleep(2000);
                
                
                            
                      System.out.println(Yellow + " \n                  +++++++++++++ WE ENTER IN THE  ADDITION ENVIRONMENT ++++++++++++++++  \n"  );      
                       
                      Thread.sleep(1000);

                      System.out.println( BrightGreen+ "PLEASE ENTER THE FIRST NUMBER-- ");
                         
                      num1= sc.nextFloat();

                      System.out.println( BrightGreen + "PLEASE ENTER THE SECOND NUMBER--");

                      num2 = sc.nextFloat();
                             
                       R = num1+num2;

                        Thread.sleep(2000);                        
                
                         System.out.print( BrightMagenta +"\n<<<<<<<<<<<<<<<< AFTER THE ADDITION YOUR RESULT IS-- ");

                        
                        Thread.sleep(2000);    
                        System.out.print(+R);   

                              } catch (Exception e){}

                        }else if( op == '-')
                  {
                   System.out.println("SUBTRACTION OPERATOR" +op);

                      try{
                      Thread.sleep(1000);
                

                    System.out.println("\n                       ----------PROCESSING----------            ");

                    ///VALUES 
                    
                      Thread.sleep(3000);
        

                    System.out.println(" \n ------------------- WE ENTER IN THE  SUBTRACTION  ENVIRONMENT ++++++++++++++++");

                     
                      Thread.sleep(1000);

                    System.out.println("\n PLEASE ENTER THE FIRST NUMBER ");
                     
                    num1=sc.nextFloat();

                      System.out.println(" \n PLEASE ENTER THE SECOND NUMBER ");
                       
                    num2=sc.nextFloat();

                    R=num1-num2;

                    System.out.print(BrightMagenta +" \n <<<<<<<<<<<<<<<< AFTER THE SUBTRACTION YOUR RESULT IS-- " );
                     
                    
                      Thread.sleep(1000);
                      System.out.println( " "+R);

                  }catch( Exception e){}


                  }else if(op == '*')
                  {
                    System.out.println("MULTIPLICATION OPERATOR");
                    
                       try {
                      Thread.sleep(1000);
            

                    System.out.println("\n                       ----------PROCESSING----------            ");

                    ///VALUES 
                    
                      Thread.sleep(3000);
                

                    System.out.println(" \n ------------------- WE ENTER IN THE  MULTIPLYING  ENVIRONMENT ++++++++++++++++");

                
                      Thread.sleep(1000);
                     
    

                    System.out.println("\n PLEASE ENTER THE FIRST NUMBER ");
                     
                    num1=sc.nextFloat();

                      System.out.println(" \n PLEASE ENTER THE SECOND NUMBER ");
                       
                    num2=sc.nextFloat();

                    R=num1*num2;

                    System.out.print(BrightMagenta + " \n <<<<<<<<<<<<<<<< AFTER THE MULTIPLICATION YOUR RESULT IS-- " );
                     
                    
                      Thread.sleep(1000);
                      System.out.println( " "+R);

                  }catch (Exception e){}

                  } else if(op== '/')

                  {System.out.println("DIVIDE OPERATOR"+op);

                            try{
                        Thread.sleep(1000);

                    System.out.println("\n                       ----------PROCESSING----------            ");

                    ///VALUES 
                    
                      Thread.sleep(3000);
                

                    System.out.println(" \n ------------------- WE ENTER IN THE  DIVIDING  ENVIRONMENT ++++++++++++++++");

                     
                      Thread.sleep(1000);
                     

                    System.out.println("\n PLEASE ENTER THE FIRST NUMBER ");
                     
                    num1=sc.nextFloat();

                      System.out.println(" \n PLEASE ENTER THE SECOND NUMBER ");
                       
                    num2=sc.nextFloat();

                    R=num1/num2;

                    System.out.print(BrightMagenta + " \n <<<<<<<<<<<<<<<< AFTER THE DIVISION YOUR RESULT IS-- " );
                     
                   
                      Thread.sleep(1000);
                      System.out.println( " "+R);

                            }catch(Exception e){}
                    
                }
                       try{
                        Thread.sleep(500);
                       }
                       catch (Exception e){}
                      System.out.println( BrightBlue + " \n\nDO YOU WANT TO CONTINUE PRESS Y / N  ");
                 ch= sc.next().charAt(0);
                }
                while (ch =='Y' || ch !='N');
                

    }

}