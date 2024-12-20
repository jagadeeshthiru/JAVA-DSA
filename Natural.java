class Area
{
      public static void main(String[]args)
       {
            int num=1;
            int sum =0;
            int prod =1;
            while(num<=10)
             {
                System.out.println(num);
num++;
                 if(num%2==0)
                   {
                      sum=sum+num; 
                      System.out.println(sum);
                   }
                   else
                     {
                          prod =prod*num;
                          System.out.println(prod);
                      }
             }
       }
}


                  