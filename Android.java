public Os
{
   public void phone()
     {
           System.out.println("Only for calls");
     }
    public void mobile()
     {
         System.out.println("for gaming and Internet");
     }

}
class Android extends Os
{
  public void phone()
    {
        System.out.println("calls and good security");
    }
     public void mobile()
     {
         System.out.println("for security and memory and  Internet");
     } 
     public static void main(String[] args)
      {
          Android a1;
            a1=new Os();
            a1.phone();
           a1.mobile();
      }
}