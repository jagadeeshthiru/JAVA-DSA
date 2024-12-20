class Exp1
{
  public void mul(int x,int y)
    {
     System.out.println("Hello method");

      System.out.println(x/y);
    }
   public static void main(String[]args)
    {
           System.out.println("before the exception ");
             Exp1 exp=new Exp1();
             exp.mul(10,0);
            System.out.println("After the Exception");


    }
}