public class Arth {
    public static void main(String[] args) {
	  Arth a1=new Arth();
	  a1.m1(10,0);
   }
    
    public void m1(int a,int b)
    {
        try{
    	     System.out.println(a/b);
          }
        catch(ArithmeticException ae)
          {
          System.out.println("Exception handle");
          }
    }
}