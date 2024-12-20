class EvilNumber
{
    public static void main(String[]args)
         {
             int num =9,power=0,sum=0,rem=0;
                  
                        power=(int)Math.pow(num,2); //81
                     while (power!=0)
                    {
                        rem=power%10; //81%10  8%10
                        //System.out.println(rem);//1 8
                        sum=sum+rem;  //1 1+8=9
                        
                        power=power/10; //81/10=8 8/10=0
                        
                   }
                      System.out.println(sum); 
                   
                     if(num==sum)
                      {
                          System.out.println("It is Evil Number");
                      }
                       else
                         {
                            System.out.println("It is not evil");
                         }
                       
         }
}