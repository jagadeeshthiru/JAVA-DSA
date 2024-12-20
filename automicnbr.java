class AutomicNbr
{
      public static void main(String[]args)
           {
               int num=76,rem=0,prod=0,count=0;
                prod=num*num;
                System.out.println(prod); 
             
                    rem=prod%100;                  
                    System.out.println(rem); 
                   
                    
                   
                 //System.out.println(rem);
                 if(rem==num)
                   { 
                            System.out.println("Automic number");
                   }
                   else
                   { 
                            System.out.println("Not Automic number");
                   }
               
           }
}