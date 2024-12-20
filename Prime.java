class PrimeOrnot
{
   public static void main(String[]args)
{
     int num =1;
     int end=23,count=0;
   while(num<=end)
   {
      if(end%num==0)
       {
         count++ ;
       }
     num++;
     
   }
         System.out.println("Total count is: "+count);
           if(count==2)
               {
                    System.out.println(end+" :It is a prime Number");
               }        
               else
                  {
                      System.out.println(end+" :it is not a prime number");
                   }
}
}