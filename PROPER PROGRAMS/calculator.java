import java.util.*;


 
public class calculator{
    public static void main(String[] args){

        char op,selection,ch;
        float num1,num2 ,R;
          Scanner sc= new Scanner(System.in); 
          
        System.out.println("      \n      ********ENTER THE WORLD OF CALCULATOR*********         " );

                  /// ***USING SLEEP METHOD HELP OF TRY AND CATCH

                 try{
                Thread.sleep (1000);}
                catch(Exception e){}
            
                /////// ********** TAKING INPUT AND SELECTING OPERATORS ********

                do{

                System.out.println(" \n PLEASE SELECT THE OPERATOR---  + , - , * , /");

                               op = sc.next().charAt(0);    /// charcater input


                    //// ******ACTIONS ON OPERATORS********

                      System.out.print("    YOUR SELECTED OPERATOR IS>>>>>>>>>>>>>> " );

                     try{
                        Thread.sleep(1000);                                                                         
                    }
                    catch(Exception e){}
                  
                  if ( op == '+') {

                      System.out.println("ADDITION OPERATOR (+) "); 

                      try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){} 

                    System.out.println(" \n           ......  PROCESSING ......."             );

                            ///// VALUES     
                             try{
                        Thread.sleep(2000);
                    }
                    catch(Exception e){}
                            
                      System.out.println(" \n                  +++++++++++++ WE ENTER IN THE  ADDITION ENVIRONMENT ++++++++++++++++\n"         );

                      System.out.print("PLEASE ENTER THE FIRST NUMBER-- ");
                         
                      num1= sc.nextFloat();

                      System.out.print("PLEASE ENTER THE SECOND NUMBER--");

                      num2 = sc.nextFloat();
                             
                       R = num1+num2;

                       try{
                        Thread.sleep(2000);                        
                       }
                       catch (Exception e)
                       {

                       }

                         System.out.print("<<<<<<<<<<<<<<<< AFTER THE ADDITION YOUR RESULT IS-- ");

                          try{
                        Thread.sleep(2000);    
                        System.out.print(+R);                    
                       }
                       catch (Exception e)
                       {}
                      
                        }else if( op == '-')
                  {
                   System.out.println("SUBTRACTION OPERATOR" +op);
                      try{
                      Thread.sleep(1000);
                    }
                    catch(Exception e){}

                    System.out.println("\n                       ----------PROCESSING----------            ");

                    ///VALUES 
                    try{
                      Thread.sleep(3000);
                    }
                    catch(Exception e){}

                    System.out.println(" \n ------------------- WE ENTER IN THE  SUBTRACTION  ENVIRONMENT ++++++++++++++++");

                     try{
                      Thread.sleep(1000);
                     }
                     catch(Exception e ){}

                    System.out.println("\n PLEASE ENTER THE FIRST NUMBER ");
                     
                    num1=sc.nextFloat();

                      System.out.println(" \n PLEASE ENTER THE SECOND NUMBER ");
                       
                    num2=sc.nextFloat();

                    R=num1-num2;

                    System.out.print(" \n <<<<<<<<<<<<<<<< AFTER THE SUBTRACTION YOUR RESULT IS-- " );
                     
                    try{
                      Thread.sleep(1000);
                      System.out.println( " "+R);
                    }
                    catch(Exception e){}


                  }else if(op == '*')
                  {
                    System.out.println("MULTIPLICATION OPERATOR");
                    
                      try{
                      Thread.sleep(1000);
                    }
                    catch(Exception e){}

                    System.out.println("\n                       ----------PROCESSING----------            ");

                    ///VALUES 
                    try{
                      Thread.sleep(3000);
                    }
                    catch(Exception e){}

                    System.out.println(" \n ------------------- WE ENTER IN THE  MULTIPLYING  ENVIRONMENT ++++++++++++++++");

                     try{
                      Thread.sleep(1000);
                     }
                     catch(Exception e ){}

                    System.out.println("\n PLEASE ENTER THE FIRST NUMBER ");
                     
                    num1=sc.nextFloat();

                      System.out.println(" \n PLEASE ENTER THE SECOND NUMBER ");
                       
                    num2=sc.nextFloat();

                    R=num1*num2;

                    System.out.print(" \n <<<<<<<<<<<<<<<< AFTER THE MULTIPLICATION YOUR RESULT IS-- " );
                     
                    try{
                      Thread.sleep(1000);
                      System.out.println( " "+R);
                    }
                    catch(Exception e){}
                  
                  }else if(op== '/')
                  {System.out.println("DIVIDE OPERATOR"+op);

                      try{
                      Thread.sleep(1000);
                    }
                    catch(Exception e){}

                    System.out.println("\n                       ----------PROCESSING----------            ");

                    ///VALUES 
                    try{
                      Thread.sleep(3000);
                    }
                    catch(Exception e){}

                    System.out.println(" \n ------------------- WE ENTER IN THE  DIVIDING  ENVIRONMENT ++++++++++++++++");

                     try{
                      Thread.sleep(1000);
                     }
                     catch(Exception e ){}

                    System.out.println("\n PLEASE ENTER THE FIRST NUMBER ");
                     
                    num1=sc.nextFloat();

                      System.out.println(" \n PLEASE ENTER THE SECOND NUMBER ");
                       
                    num2=sc.nextFloat();

                    R=num1/num2;

                    System.out.print(" \n <<<<<<<<<<<<<<<< AFTER THE DIVISION YOUR RESULT IS-- " );
                     
                    try{
                      Thread.sleep(1000);
                      System.out.println( " "+R);
                    }
                    catch(Exception e){}
                }
                     
                
              System.out.print("\n DO YOU WANT TO CONTINUE PRESS Y / N  ");
                 ch= sc.next().charAt(0);
                }
                while (ch =='Y' || ch !='N');
                

    }
}
