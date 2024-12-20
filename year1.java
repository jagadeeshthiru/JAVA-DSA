class Year1
{
    public static void main(String[]args)
      {
          int year=1;
            while(year<=200)
            {
              if(year%4==0&&year%100!=0||year%400==0)
                {
                     System.out.println("It is leap year :"+year);
                }
                
                year++;
               
           }
            
             
      }
}