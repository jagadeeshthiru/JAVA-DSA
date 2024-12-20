class Descend
{
    public static void main(String[]args)
    {
        int num1=200,num2=100,end =20;
          while( num1<=end)
         {
                 if(num1<=num2)
                    {
                        if(num2<=end)
                           {
                               end--;
                           }
                          num2--;
                     }
               System.out.println(end);
                System.out.println(num2);

          }   
      }
            
}
