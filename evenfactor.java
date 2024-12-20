class EvenFactor
{
     public static void main(String[]args)
{
      int num=1;
      int end=120,fact=1;
      while(num<=end)
      {
           
        if(end%num==0&&num%2==0)            
           
               {
                   System.out.println("The even Factors are :"+num);
               }
               
             num++;
       } 

} 
}