class Year
{
    public static void main(String[]args)
      {
          int year=1;
            while(year<=3000)
              if(year%4==0&&year%400==0||year%100!=0)
                {
                     System.out.println(year);
                }
             System.out.println(year);
              year++;


      }
}