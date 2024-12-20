class Gcd
{
  public static void main(String[]args)
       {
            int num1 =100,num2=200,min=0,start=1;
             if(num1<num2)
                {
                    min=num1;
                }
              else
                   {
                          min=num2;
                   }
          while(start<=min)
             {
               if(num1%start==0&&num2%start==0)
                   {
                       System.out.println(start);
                   }
                 start++;
             }
                    
       }
}