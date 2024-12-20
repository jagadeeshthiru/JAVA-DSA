class Maino
{
  public static void main(String[]args)
    {
      try
     {
      String s=new String("hello");
      System.out.println(s.toUpperCase());
       s=null;
      System.out.println(s.toUpperCase());
       
     }
      catch(NullPointerException ne)
       {
        System.out.println("Iam catch");
       }
     finally
       {
            
       }
      
       
    }
}