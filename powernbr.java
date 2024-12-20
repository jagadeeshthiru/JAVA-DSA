class 	PowerNbr
{
     public static void main(String[]args)
      {
            int num=133,rem=0,sum=0,prod=1;
              while(num!=0)
              {
                rem=num%10;
                System.out.println(rem);
                 sum=sum+rem;
                 prod=prod*rem;
                 num=num/10;
              }
              System.out.println(sum);
              System.out.println(prod);
                if(sum==prod)
                   {
                         System.out.println("It is a powerNumber");
                    }
                  else
                     {
                         System.out.println("It is a not powerNumber");
                    }

 
      }
} 