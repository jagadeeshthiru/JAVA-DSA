class Area
{
      public static void main(String[]args)
       {
            int num=1;
            int sum =0;
            int prod =1;
            while(num<=10)
             {
                  if(num%2==0)
                   {
                      sum=sum+num; 
                      System.out.println("The sum of even number:"+sum);
                   }
                   else
                     {
                          prod =prod*num;
                          System.out.println("The sum of even number:"+prod);
                      }
                     System.out.println(num);
num++;

             }
       }
}


                  