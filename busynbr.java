class BusyNbr
{
    public static void main(String[]args)
    {
      int num=1237,rem=0;
      
        rem=num%10;
        num=num/10;
      if(rem==7||num%7==0)
        {
             System.out.println("It is busy number");
        }
     else
        {
             System.out.println("It is not busy number");

        }
      
           
        
    }
}