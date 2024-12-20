class Fizzbuzz
{
         public static void main(String[]args)
           {
             int num=1;
             while(num<=100)
              {
               if(num%3==0&&num%5==0)
                  {
                     System.out.println("it is fizzbuzz :"+num);
                  }
               else if(num%3==0)
                 {
                       System.out.println("it is fizz :"+num);
                 }
                 else if(num%5==0)
                    { 
                            System.out.println("it is buzz :"+num);
                     }
                num++;
              }
           }
}