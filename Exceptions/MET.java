import java.io.FileNotFoundException;
class MET
{
   public static void main(String[]args) throws FileNotFoundException
    {
       m1();
    }
   public static void m1()  throws FileNotFoundException 
   {
        m2();
   }
   public static void m2()  throws FileNotFoundException
   {
     m3();
   }
   public static void m3()  throws FileNotFoundException
   {
      m4();
   }
   public static void m4() throws FileNotFoundException
   {
      File reader file =new File Reader("C:\\Users\\jagadeesh\\Desktop\\Interview questions");
       System.out.println("File Existed");
   }



}